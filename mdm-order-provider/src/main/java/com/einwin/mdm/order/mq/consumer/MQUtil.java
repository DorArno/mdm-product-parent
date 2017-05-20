package com.einwin.mdm.order.mq.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.einwin.mdm.order.util.Constant;
import com.einwin.mqcenter.api.model.SendMessageRequest;
import com.einwin.mqcenter.client.MqClient;
import com.fasterxml.jackson.core.JsonProcessingException;

public class MQUtil {
	
	private static final Logger logger = LoggerFactory.getLogger(MQUtil.class );
	
	/**
	 * 发送MQ信息
	 * @param orderMessage
	 */
	public static void rubbitMQSend(String orderMessage){
		SendMessageRequest request = new SendMessageRequest();
		request.setContent(orderMessage);
		request.setExchange(Constant.EXCHANGE_NAME);
		request.setQueue(Constant.QUEUE_NAME);
		request.setRoutingKey(Constant.ROUTE_NAME);
		try {
			long sendNum = MqClient.sendMessage(request);
		} catch (JsonProcessingException e) {
			logger.error("rubbitMQSend Json Process error:" + e);
			e.printStackTrace();
		}
	}
	

}
