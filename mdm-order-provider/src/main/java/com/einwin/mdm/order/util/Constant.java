package com.einwin.mdm.order.util;

public interface Constant {
	
	//产品订单类型
	String PRODUCT_ORDER_TYPE = "0";
	
	//团购订单类型
	String GROUPON_ORDER_TYPE = "1";

	//服务订单类型
	String SERVICE_ORDER_TYPE = "2";
	
	//下发到积分系统服务名
	String SERVICE_NAME = "point-center";
	
	//积分系统交易名称
	String EXCHANGE_NAME = SERVICE_NAME+"-"+"PointMQExchangeForOrder";
	
	//积分系统队列名称
	String QUEUE_NAME = SERVICE_NAME+"-"+"PointMQQueueForOrder";
	
	//积分系统路由名称
	String ROUTE_NAME=SERVICE_NAME+"-"+"PointMQRouteForOrder";
	
	
}
