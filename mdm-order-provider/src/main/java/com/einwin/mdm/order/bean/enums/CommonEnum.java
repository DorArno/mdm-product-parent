/**   
 * Copyright © 2016 Arvato. All rights reserved.
 * 
 * @Title: CommonEnum.java 
 * @Prject: mdm-core
 * @Package: com.mdm.core.enums 
 * @Description: TODO
 * @author: LUPE004   
 * @date: 2016年11月25日 上午10:17:55 
 * @version: V1.0   
 */
package com.einwin.mdm.order.bean.enums;

/** 
 * @ClassName: CommonEnum 
 * @Description: TODO
 * @author: LUPE004
 * @date: 2016年11月25日 上午10:17:55  
 */
public enum CommonEnum {
	
	ISNOTDELETE(0, "ISNOTDELETE","数据没有被删除"), 
	ISDELETE(1,"ISDELETE", "数据已被删除");
	
	private Integer value;
	private String code;
	private String desc;
	
	private CommonEnum(Integer value,String code, String desc) {
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
