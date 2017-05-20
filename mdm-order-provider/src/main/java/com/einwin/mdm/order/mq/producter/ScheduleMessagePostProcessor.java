/**   
 * Copyright © 2016 Arvato. All rights reserved.
 * 
 * @Title: ScheduleMessagePostProcessor.java 
 * @Prject: district-service
 * @Package: com.mdm.district.mq.producter 
 * @Description: TODO
 * @author: guox005   
 * @date: 2016年11月29日 下午2:44:54 
 * @version: V1.0   
 */
package com.einwin.mdm.order.mq.producter;

import org.apache.activemq.ScheduledMessage;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.core.MessagePostProcessor;

import javax.jms.JMSException;
import javax.jms.Message;

/**
 * @ClassName: ScheduleMessagePostProcessor
 * @Description: 实现消息延迟发送
 * @author: guox005
 * @date: 2016年11月29日 下午2:44:54
 */
public class ScheduleMessagePostProcessor implements MessagePostProcessor {
	private static Logger logger = LoggerFactory.getLogger(ScheduleMessagePostProcessor.class);
	// 默认延迟5秒
	private long delay = 5000l;
	// 按corn表达式延时（注：此corn表达式并非Quartz框架中的corn表达式，
	// 而是linux中corntab中的表达 式，基本顺序是"分(0-59) 时(0-23) 日(1-31) 月（1-12） 星期几(1-7) "）
	private String corn = null;

	public ScheduleMessagePostProcessor(long delay) {
		this.delay = delay;
	}
	public ScheduleMessagePostProcessor(String cron) {
		this.corn = cron;
	}
	
	/**
	 * 
	 */
	public Message postProcessMessage(Message message) throws JMSException {
		if (delay > 0) {
			message.setLongProperty(ScheduledMessage.AMQ_SCHEDULED_DELAY, delay);
		}
		if (!StringUtils.isEmpty(corn)) {
			message.setStringProperty(ScheduledMessage.AMQ_SCHEDULED_CRON, corn);
		}
		return message;
	}
}
