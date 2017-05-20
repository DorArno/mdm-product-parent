/**   
 * Copyright © 2016 Arvato. All rights reserved.
 * 
 * @Title: TaskTypeEnum.java 
 * @Prject: mdm-core
 * @Package: com.mdm.core.enums 
 * @Description: TODO
 * @author: guox005   
 * @date: 2016年11月3日 上午11:37:43 
 * @version: V1.0   
 */
package com.einwin.mdm.order.bean.enums;

/** 
 * @ClassName: TaskTypeEnum 
 * @Description: TODO
 * @author: guox005
 * @date: 2016年11月3日 上午11:37:43  
 */
public enum TaskTypeEnum {
	BATCHMQTASK(1,"BATCHMQTASK","批量下发MQ");
	private Integer value;
	private String code;
	private String desc;
	
	private TaskTypeEnum(Integer value,String code, String desc) {
		this.value = value;
		this.code = code;
		this.desc = desc;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
}
