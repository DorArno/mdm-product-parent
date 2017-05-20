package com.einwin.mdm.order.mq.consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.einwin.mdm.order.convert.Convert;
import com.einwin.mdm.order.convert.GrouponOrderConvert;
import com.einwin.mdm.order.convert.ProductOrderConvert;
import com.einwin.mdm.order.convert.ServiceOrderConvert;
import com.einwin.mdm.order.util.Constant;
/**
 * 
 * @author LUPE004
 *
 */
public class ConvertRubbitMQOrder {
	
	static Map<String,Convert> map = new HashMap<String,Convert>();
	
	static{
		map.put(Constant.PRODUCT_ORDER_TYPE, new ProductOrderConvert());
		map.put(Constant.GROUPON_ORDER_TYPE, new GrouponOrderConvert());
		map.put(Constant.SERVICE_ORDER_TYPE, new ServiceOrderConvert());
	}
	
	public static String convert(String message){
		Optional<String> optial = Optional.of(message);
		message = optial.get().toLowerCase();
		JSONObject jsonObj = JSON.parseObject(message);
		JSONObject dataObject = (JSONObject)jsonObj.get("data");
		JSONObject rubbiteMQ = new JSONObject();
		JSONArray jsonArray = new JSONArray();
		Convert convert = map.get((String)dataObject.get("salestype"));
		return convert.convert(rubbiteMQ, dataObject, jsonArray);
	}
		

}
