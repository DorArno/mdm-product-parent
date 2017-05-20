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
 * @author: gaod003
 * @date: 2016年10月8日 下午3:35:03  
 */
public enum ErrorCodeEnum {
	
	SUCCESS(200, "处理成功","请求响应成功"), 
	FAIL(201,"处理失败", "请求响应失败"),
	UN_AUTH(401,"未授权", "请求服务未授权"),
	NOT_EXIST_SERVICE(404,"不存在此服务", "不存在此服务"),
	MERCHANT(500,"服务器内部错误", "服务器内部错误"),
	DUPLICATE_SUBMIT(999,"请求重复提交", "请求重复提交");
	
	private Integer code;
	private String msg;
	private String desc;
	
	private ErrorCodeEnum(Integer code,String msg, String desc) {
		this.code = code;
		this.msg = msg;
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public static String getMsgByCode(Integer code) {
		String msg = "";
        ErrorCodeEnum [] array = ErrorCodeEnum.values();
        for (ErrorCodeEnum obj : array) {
            if (code.equals(obj.code)) {
            	msg = obj.msg;
                break;
            }
        }
        return msg;
    }
	
	public static void main(String args[]){
		System.out.println(ErrorCodeEnum.UN_AUTH.code);
		System.out.println(ErrorCodeEnum.getMsgByCode(404));
	}
	
}
