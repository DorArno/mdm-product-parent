/**   
 * Copyright © 2016 Arvato. All rights reserved.
 * 
 * @Title: AuthenticationInfo.java 
 * @Prject: mdm-bean
 * @Package: com.mdm.common 
 * @Description: TODO
 * @author: gaod003   
 * @date: 2016年10月10日 下午2:05:32 
 * @version: V1.0   
 */
package com.einwin.mdm.order.bean.common;

/** 
 * @ClassName: AuthenticationInfo 
 * @Description: 接口授权认证对象信息（header）
 * @author: gaod003
 * @date: 2016年10月10日 下午2:05:32  
 */
public class AuthenticationInfo {
	
	private String timeStamp; //时间戳	
	private String sysCode;   //系统编码
	private String sign;      //授权码+时间戳 md5加密后的验签
	/**
	 * @return the timeStamp
	 */
	public String getTimeStamp() {
		return timeStamp;
	}
	/**
	 * @param timeStamp the timeStamp to set
	 */
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	/**
	 * @return the sysCode
	 */
	public String getSysCode() {
		return sysCode;
	}
	/**
	 * @param sysCode the sysCode to set
	 */
	public void setSysCode(String sysCode) {
		this.sysCode = sysCode;
	}
	/**
	 * @return the sign
	 */
	public String getSign() {
		return sign;
	}
	/**
	 * @param sign the sign to set
	 */
	public void setSign(String sign) {
		this.sign = sign;
	}
	
}
