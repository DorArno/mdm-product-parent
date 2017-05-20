/**   
 * Copyright © 2016 Arvato. All rights reserved.
 * 
 * @Title: LogTypeEnum.java 
 * @Prject: mdm-common
 * @Package: com.mdm.enums 
 * @Description: TODO
 * @author: guox005   
 * @date: 2016年10月8日 下午4:17:55 
 * @version: V1.0   
 */
package com.einwin.mdm.order.bean.enums;

/** 
 * @ClassName: LogTypeEnum 
 * @Description: TODO
 * @author: guox005
 * @date: 2016年10月8日 下午4:17:55  
 */
public enum LogTypeEnum {
	ADD(1,"Add","新增"),UPDATE(2,"Update","修改"),DELETE(9,"Delete","删除");
	
	private Integer value;
	private String code;
	private String desc;
	
	private LogTypeEnum(Integer value,String code, String desc) {
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
