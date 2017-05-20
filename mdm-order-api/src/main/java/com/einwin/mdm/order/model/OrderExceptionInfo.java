package com.einwin.mdm.order.model;

import org.apache.commons.lang3.StringUtils;

import java.util.UUID;

public class OrderExceptionInfo {
	
	private String id;
	
	private String message;
	
	private String ordertype;
	
	private String retrycount;
	
	public String getOrdertype() {
		return ordertype;
	}

	public void setOrdertype(String ordertype) {
		this.ordertype = ordertype;
	}

	public String getId() {
		if(StringUtils.isEmpty(id)){
			id = UUID.randomUUID().toString();
		}
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRetrycount() {
		return retrycount;
	}

	public void setRetrycount(String retrycount) {
		this.retrycount = retrycount;
	}
	
	

}
