package com.einwin.mdm.order.convert;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class ServiceOrderConvert implements Convert{

	/**
	 * 服务订单JSON转换(积分商城)
	 * @param rubbiteMQ 自定义JSON对象
	 * @param dataObject 原JSON对象
	 * @param jsonArray 原订单项对象
	 * @return 积分商城JSON字符串
	 */
	@Override
	public String convert(JSONObject rubbiteMQ, JSONObject dataObject, JSONArray jsonArray) {
		//订单类型 0-商品订单，1-团购订单，2-服务订单，3-秒杀订单，4-限购订单
				rubbiteMQ.put("salesType", dataObject.get("salestype"));
				//积分金额
				rubbiteMQ.put("pointAmount", dataObject.get("pointamount"));
				//组织ID
				rubbiteMQ.put("organizationId", dataObject.get("sellerid"));
				//实收金额
				rubbiteMQ.put("realAmount", dataObject.get("orderprice"));
				//秒杀活动id或团购活动ID
				rubbiteMQ.put("activityId", dataObject.get("id"));
				//订单完成日期
				rubbiteMQ.put("confirmDate", dataObject.get("finishedtime"));
				//下单时间
				rubbiteMQ.put("orderTime", dataObject.get("ordertime"));
				//商家ID
				rubbiteMQ.put("merchantId", dataObject.get("sellerid"));
				//客户ID
				rubbiteMQ.put("customerId", dataObject.get("customerid"));
				//订单号
				rubbiteMQ.put("orderCode", dataObject.get("ordernumber"));
				//主ID
				rubbiteMQ.put("id", dataObject.get("id"));
				//订单付款日期?
				rubbiteMQ.put("paymentDate", dataObject.get("paymentdate"));
				//支付方式
				rubbiteMQ.put("paymentMethodType", dataObject.get("platformcode"));
				//订单金额 需要使用订单项乘出来
				rubbiteMQ.put("moneyAmount",null);
				//下单渠道
				rubbiteMQ.put("orderOriginChannel", dataObject.get("platformcode"));
				//订单明细
				JSONArray array = (JSONArray)dataObject.get("saleDetails");
				
				return rubbiteMQ.toJSONString();
	}
	
	

}
