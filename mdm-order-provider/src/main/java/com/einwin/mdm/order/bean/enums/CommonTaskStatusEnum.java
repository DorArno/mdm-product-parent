/**   
 * Copyright © 2016 Arvato. All rights reserved.
 * 
 * @Title: CommonTaskStatusEnum.java 
 * @Prject: mdm-core
 * @Package: com.mdm.core.enums 
 * @Description: TODO
 * @author: guox005   
 * @date: 2016年11月3日 下午5:27:17 
 * @version: V1.0   
 */
package com.einwin.mdm.order.bean.enums;

/** 
 * @ClassName: CommonTaskStatusEnum 
 * @Description: TODO
 * @author: guox005
 * @date: 2016年11月3日 下午5:27:17  
 */
public enum CommonTaskStatusEnum {
	NEW(0,"New","新建"),
	COMPLETED(1,"Completed","完成"),
	FAIL(9,"Fail","失败");
	
	private Integer value;
	private String code;
	private String desc;
	
	private CommonTaskStatusEnum(Integer value,String code, String desc) {
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
