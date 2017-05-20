/**   
 * Copyright © 2016 Arvato. All rights reserved.
 * 
 * @Title: HttpContent.java 
 * @Prject: mdm-common
 * @Package: com.mdm.util 
 * @Description: TODO
 * @author: gaod003   
 * @date: 2016年9月30日 上午9:16:48 
 * @version: V1.0   
 */
package com.einwin.mdm.order.util;

import com.alibaba.fastjson.JSON;
import com.einwin.mdm.order.bean.common.AuthenticationInfo;
import com.github.pagehelper.util.StringUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

/** 
 * @ClassName: HttpContent 
 * @Description: TODO
 * @author: gaod003
 * @date: 2016年9月30日 上午9:16:48  
 */
@Service
public class HttpContent {
	
	private static InheritableThreadLocal<String> operatorIdLocal= new InheritableThreadLocal<String>();
	
	private static InheritableThreadLocal<String> requestBodyLocal= new InheritableThreadLocal<String>();
	
	private static InheritableThreadLocal<Map<String,String>> shareParamsLocal= new InheritableThreadLocal<Map<String,String>>();
	
	private static InheritableThreadLocal<HttpServletRequest> requestLocal= new InheritableThreadLocal<HttpServletRequest>();
	
	private static InheritableThreadLocal<String> responseMsgLocal= new InheritableThreadLocal<String>();
	
	private static InheritableThreadLocal<String> logIdLocal= new InheritableThreadLocal<String>();
	
	private static InheritableThreadLocal<String> sysCodeLocal= new InheritableThreadLocal<String>();
       
    private static InheritableThreadLocal<String> operatorIpLocal= new InheritableThreadLocal<String>();
    
    public static String getOperatorIpLocal() {
		return (String)operatorIpLocal.get();
	}

	public static void setOperatorIpLocal(String operatorIp) {
		operatorIpLocal.set(operatorIp);
	}

	public static HttpServletRequest getRequest() {
       return (HttpServletRequest)requestLocal.get();
   }   
   
   public static void setRequest(HttpServletRequest request) {
       requestLocal.set(request);   
   }  
   
	/**
	 * @return the operatorId
	 */
	public static String getSysCodeLocal() {
		return (String)sysCodeLocal.get();
	}

	/**
	 * @param operatorId the operatorId to set
	 */
	public static void setSysCodeLocal(String sysCode) {
		sysCodeLocal.set(sysCode);
	}
   
	/**
	 * @return the operatorId
	 */
	public static String getLogId() {
		return (String)logIdLocal.get();
	}

	/**
	 * @param operatorId the operatorId to set
	 */
	public static void setLogId(String logId) {
		logIdLocal.set(logId);
	}

	/**
	 * @return the operatorId
	 */
	public static String getOperatorId() {
		return (String)operatorIdLocal.get();
	}

	/**
	 * @param operatorId the operatorId to set
	 */
	public static void setOperatorId(String operatorId) {
		operatorIdLocal.set(operatorId);
	}
	
	/**
	 * @return the operatorId
	 */
	public static String getBody() {
		return (String)requestBodyLocal.get();
	}

	/**
	 * @param operatorId the operatorId to set
	 */
	public static void setBody(String body) {
		requestBodyLocal.set(body);
	}

	public static void setShareParams(Map<String,String> map){
		shareParamsLocal.set(map);
	}
	
	public static Map<String,String> getShareParams() {
		return shareParamsLocal.get();
	}
	
	/**
	 * @return the operatorId
	 */
	public static String getResonseMsg() {
		return (String)responseMsgLocal.get();
	}

	/**
	 * @param operatorId the operatorId to set
	 */
	public static void setResponseMsg(String resMsg) {
		responseMsgLocal.set(resMsg);
	}
	
	public static String getSysCode(){
		
		HttpServletRequest request = requestLocal.get();
		if(request != null){
			String authInfoStr =request.getHeader("authentication");
			
			if(!StringUtil.isEmpty(authInfoStr)){
	        	AuthenticationInfo authInfo =JSON.parseObject(authInfoStr, AuthenticationInfo.class);
	        	return authInfo.getSysCode();
			}
		}
		return "";
	}
	
}
