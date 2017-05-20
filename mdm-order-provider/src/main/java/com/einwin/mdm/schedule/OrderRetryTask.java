package com.einwin.mdm.schedule;

import java.util.List;

import com.einwin.mdm.order.mq.producter.QueueProducter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.einwin.mdm.order.model.OrderExceptionInfo;
import com.einwin.mdm.order.mq.consumer.OrderReceiver;
import com.einwin.mdm.order.service.OrderErrorLogService;

@Component
public class OrderRetryTask {
	
	@Autowired
	private OrderReceiver orderReceiver;
	
	@Autowired
	private OrderErrorLogService productorderService;
	
	private static final String EXECUTE_FINISH = "1";

	@Autowired
	private JmsTemplate jmsTemplate;

	//@Scheduled(fixedRate = 3000)
	public void insertMQ(){
		String message = "{\"operation\":\"Add\",\"timeStamp\":\"2017/5/911:50:03\",\"data\":{\"platformCode\":\"APP\",\"sellerType\":1,\"customerId\":\"9fc75940-b499-4b6d-af66-76cc200b4f0c\",\"sellerId\":\"8b1b568b-651c-4aa0-bcad-0d66af74c38b\",\"communityId\":\"9146b807-f45a-477d-bc8f-8ac202a73af8\",\"consignee\":\"侯先生\",\"address\":\"丰台区，光彩路72号院，3号楼地下物业服务中心\",\"email\":null,\"postCode\":null,\"telphone\":null,\"orderStatusCode\":\"BeforeDelivery\",\"paymentStatusCode\":\"Payment\",\"paymentMethodTypeCode\":\"Tenpay\",\"pointAmount\":0,\"orderTotal\":1.99,\"couponsTotal\":null,\"promotionTotal\":null,\"isDelayedDelivery\":null,\"paymentDate\":\"2017-02-13T14:00:20.343\",\"saleDetails\":[{\"id\":\"cc845ede-307d-46d6-aec7-2b5efcd3f1bb\",\"orderId\":\"1ad83927-b473-41fe-9126-d95a1c8e06f7\",\"productId\":\"879fdf77-25cf-4055-82c6-ab990688057e\",\"productName\":\"虹羽茶业|传承传统工艺制成英德红茶|牛皮纸装250克一袋\",\"skuId\":\"2446176f-980c-40d6-8fde-7f8edab38464\",\"unitPrice\":1.99,\"quantity\":1,\"pointAmount\":0,\"promotionPrice\":null,\"couponsPrice\":null,\"orderStatuCode\":\"BeforeDelivery\",\"logistics\":\"\",\"logisticsNo\":null}],\"id\":\"1ad83927-b473-41fe-9126-d95a1c8e06f7\",\"createdOn\":\"2017-02-13T14:00:04.667\",\"createdBy\":\"9fc75940-b499-4b6d-af66-76cc200b4f0c\",\"modifiedOn\":\"2017-05-09T11:49:51.9764443+08:00\",\"modifiedBy\":\"9af740c1-4984-4d25-bd8b-85b45f241ce5\",\"isDeleted\":0,\"rowVersion\":2415041}}";
		this.jmsTemplate.convertAndSend("ProductOrder_Up_SSY",message);
	}



	//@Scheduled(fixedRate = 20000)
	public void retryTask() throws InterruptedException {		
		List<OrderExceptionInfo> list = productorderService.get();
		list.forEach(order->{
			String type = order.getOrdertype();
			try {
				orderReceiver.orderReciver(Class.forName(type).getClass(),order.getMessage());
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			order.setRetrycount(EXECUTE_FINISH);
			productorderService.update(order);
		});
    }
	
}
