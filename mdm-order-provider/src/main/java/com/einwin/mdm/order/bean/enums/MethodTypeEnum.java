/**   
 * Copyright © 2016 Arvato. All rights reserved.
 * 
 * @Title: MethodTypeEnum.java 
 * @Prject: mdm-core
 * @Package: com.mdm.core.enums 
 * @Description: TODO
 * @author: gaod003   
 * @date: 2016年11月4日 上午11:07:26 
 * @version: V1.0   
 */
package com.einwin.mdm.order.bean.enums;

/** 
 * @ClassName: MethodTypeEnum 
 * @Description: TODO
 * @author: gaod003
 * @date: 2016年11月4日 上午11:07:26  
 */
public enum MethodTypeEnum {
	
	DELETE("DELETE","0"),
	GET("GET","1"),
	POST("POST","2"),
	PUT("PUT","3");
	
	private String value;
	private String id;
	
	private MethodTypeEnum(String value,String id){
		this.value = value;
		this.id = id;
	}
	
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	
	public static String getIdByValue(String value) {
		String id = "";
		MethodTypeEnum [] array = MethodTypeEnum.values();
        for (MethodTypeEnum obj : array) {
            if (value.equals(obj.value)) {
            	id = obj.id;
                break;
            }
        }
        return id;
    }
	
	public static void main(String args[]){
		System.out.println(MethodTypeEnum.getIdByValue("GET"));
	}
	
}
