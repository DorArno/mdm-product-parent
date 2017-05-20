/**   
 * Copyright © 2016 Arvato. All rights reserved.
 * 
 * @Title: BusinessLogStatusEnum.java 
 * @Prject: mdm-common
 * @Package: com.mdm.enums 
 * @Description: TODO
 * @author: guox005   
 * @date: 2016年10月13日 上午10:56:06 
 * @version: V1.0   
 */
package com.einwin.mdm.order.bean.enums;

/** 
 * @ClassName: BusinessLogStatusEnum 
 * @Description: TODO
 * @author: guox005
 * @date: 2016年10月13日 上午10:56:06  
 */
public enum BusinessLogStatusEnum {
	CREATE("1","新建"),
	SENT("2","已下发"),
	COMPLETE("3","处理完成"),
	FAIL("9","失败");
	
	private String value;
	private String desc;
	private BusinessLogStatusEnum(String value,String desc){
		this.value = value;
		this.desc = desc;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
