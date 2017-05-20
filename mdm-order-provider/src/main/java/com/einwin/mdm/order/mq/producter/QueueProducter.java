package com.einwin.mdm.order.mq.producter;

import com.einwin.mdm.order.bean.constants.DigitalConstants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import javax.jms.Queue;

/**
 * @ClassName: QueueProducter
 * @Description: TODO
 * @author: guox005
 * @date: 2016年10月9日 下午3:07:16
 */
@Component
public class QueueProducter {
	@Autowired
	private JmsMessagingTemplate jmsMessagingTemplate;

	@Autowired
	private JmsTemplate jmsTemplate;

	@Qualifier("mdm.order.demo")
	private Queue mdmOrderDemoQueue;


	public void sendUserSSYQueue(String msg) {
		this.jmsTemplate.convertAndSend(this.mdmOrderDemoQueue, msg, new ScheduleMessagePostProcessor(DigitalConstants.FIVE_THOUSAND));
	}

}
