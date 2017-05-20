/**   
 * Copyright © 2016 Arvato. All rights reserved.
 * 
 * @Title: DataTypeEnum.java 
 * @Prject: mdm-common
 * @Package: com.mdm.enums 
 * @Description: TODO
 * @author: guox005   
 * @date: 2016年10月8日 下午3:35:03 
 * @version: V1.0   
 */
package com.einwin.mdm.order.bean.enums;

/** 
 * @ClassName: DataTypeEnum 
 * @Description: TODO
 * @author: guox005
 * @date: 2016年10月8日 下午3:35:03  
 */
public enum DataTypeEnum {
	USER(1, "User","用户数据"), 
	ROLE(2,"Role", "角色数据"),
	DISTRICT(3,"District", "行政区划数据"),
	ORGANAZATION(4,"Organazation", "组织机构数据"),
	MERCHANT(5,"Merchant", "商家数据"),
	SOUR(6,"Sour", "用户角色组织机构系统之间关系数据");
	
	private Integer value;
	private String code;
	private String desc;
	
	private DataTypeEnum(Integer value,String code, String desc) {
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
