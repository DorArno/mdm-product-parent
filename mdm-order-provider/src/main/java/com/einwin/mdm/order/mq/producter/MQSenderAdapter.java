package com.einwin.mdm.order.mq.producter;

import com.einwin.mdm.logging.client.LoggingService;
import com.einwin.mdm.order.bean.enums.LogTypeEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import java.util.HashMap;
import java.util.Map;

@Component
public class MQSenderAdapter {

	private static Logger logger = LoggerFactory.getLogger(MQSenderAdapter.class);

	@Autowired
	LoggingService loggingService;

	@Autowired
	private QueueProducter queueProducter;

	private static Map<Integer, String> logTypeMap = new HashMap<Integer, String>();
	static {
		logTypeMap.put(LogTypeEnum.ADD.getValue(), LogTypeEnum.ADD.getCode());
		logTypeMap.put(LogTypeEnum.UPDATE.getValue(), LogTypeEnum.UPDATE.getCode());
		logTypeMap.put(LogTypeEnum.DELETE.getValue(), LogTypeEnum.DELETE.getCode());
	}

	/**
	 * @Title: sendMQ
	 * @Description: 发送MQ
	 * @param logType
	 * @param dataType
	 * @param obj
	 * @return: void
	 */
	@Async
	@Transactional
	public void sendMQ(Integer logType, Integer dataType, Object obj) {
		queueProducter.sendUserSSYQueue("测试");
	}
}