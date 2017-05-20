/**   
 * Copyright © 2016 Arvato. All rights reserved.
 * 
 * @Title: DemoReceiver.java 
 * @Prject: mdm-service
 * @Package: com.mdm.mq.receiver 
 * @Description: TODO
 * @author: guox005   
 * @date: 2016年9月13日 下午12:56:30 
 * @version: V1.0   
 */
package com.einwin.mdm.order.mq.consumer;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import com.einwin.mdm.order.service.*;
import org.springframework.beans.factory.annotation.Autowired;
/** 
 * @ClassName: DemoReceiver 
 * @Description: TODO
 * @author: guox005
 * @date: 2016年9月13日 下午12:56:30  
 */
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.einwin.framework.service.GenericService;
import com.einwin.mdm.order.model.Grouponorder;
import com.einwin.mdm.order.model.Orderitem;
import com.einwin.mdm.order.model.Productorder;
import com.einwin.mdm.order.model.Refund;
import com.einwin.mdm.order.model.Serviceorder;

@Component
public class OrderReceiver {
	
	@Autowired
	private ProductorderService productorderService;
	
	@Autowired
	private OrderitemService orderitemService;
	
	@Autowired
	private GrouponorderService grouponorderService;
	
	@Autowired
	private RefundService refundService;
	
	@Autowired
	private ServiceorderService serviceorderService;
	
	private ConcurrentHashMap<String,OrderService> cacheService = new ConcurrentHashMap<String,OrderService>();

	private void initCacheService() {
		synchronized (this) {
			if (cacheService.size() == 0) {
				cacheService.put(Refund.class.getName(), refundService);
				cacheService.put(Serviceorder.class.getName(), serviceorderService);
				cacheService.put(Grouponorder.class.getName(), grouponorderService);
				cacheService.put(Productorder.class.getName(), productorderService);
			}
		}
	}
	
    @JmsListener(destination = "ProductOrder_Up_SSY")
    public void ProductOrder_Up_SSY(String message) {
    	orderReciver(Productorder.class,message);
    }
    
    @JmsListener(destination = "ServiceOrder_Up_SSY")
    public void ServiceOrder_Up_SSY(String message){
    	orderReciver(Serviceorder.class,message);
    }
    
    @JmsListener(destination = "GrouponOrder_Up_SSY")
    public void GrouponOrder_Up_SSY(String message){
    	orderReciver(Grouponorder.class,message);
    }
    
    @JmsListener(destination = "Refund_Up_SSY")
    public void Refund_Up_SSY(String message){
    	orderReciver(Refund.class,message);
    }
    
    public <T> void orderReciver(Class<T> classes,String message){
    	T t = ConsumerFactory.getConumerInstance(classes, message);
    	if(cacheService.size()==0)initCacheService();
    	cacheService.get(classes.getName()).insert(t,message);
    	downloadItem(message);
		MQUtil.rubbitMQSend(message);
    	//MQUtil.rubbitMQSend(ConvertRubbitMQOrder.convert(message));
    }



    
    private void downloadItem(String message){
    	List<Orderitem> orderitem = ConsumerFactory.getDetailInstance(Orderitem.class,message);
    	Optional.ofNullable(orderitem).ifPresent(k->k.forEach(e->orderitemService.insert(e,message)));
    }
        
}
