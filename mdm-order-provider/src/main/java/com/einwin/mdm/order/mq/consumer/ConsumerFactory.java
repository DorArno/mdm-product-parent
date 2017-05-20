package com.einwin.mdm.order.mq.consumer;

import java.sql.Timestamp;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.ParserConfig;
import com.einwin.mdm.order.util.MyTimeStampFormatDeserializer;

public class ConsumerFactory {
	
	private static final  Logger logger  =  LoggerFactory.getLogger(ConsumerFactory.class );
	
	private static ParserConfig parserConfig = new ParserConfig();
	
	static{
		//parserConfig.putDeserializer(Date.class, MyDateFormatDeserializer.getInstance());
		parserConfig.putDeserializer(Timestamp.class, MyTimeStampFormatDeserializer.getInstance());
	}
	
	private static <T> JSONObject getDataObject(Class<T> classes ,String... jsonstr){
		if(jsonstr.length<=0){
			throw new RuntimeException("json message can not be empty!");
		}
		logger.info(jsonstr[0]);
    	JSONObject jsonObj = JSON.parseObject(jsonstr[0]);
    	JSONObject dataObject = (JSONObject)jsonObj.get(jsonstr.length > 1 ? jsonstr[1] : "data");
    	return dataObject;
	}
	
	public static <T> T getConumerInstance(Class<T> classes ,String... jsonstr){
		JSONObject jsonObject = getDataObject(classes,jsonstr);
    	T t = JSONObject.parseObject(jsonObject.toJSONString(), classes, parserConfig,JSON.DEFAULT_PARSER_FEATURE);
    	return t;
	}
	
	public static <T> List<T> getDetailInstance(Class<T> classes ,String... jsonstr){
		JSONObject jsonObject = getDataObject(classes,jsonstr);
    	JSONArray jsonArray = (JSONArray)jsonObject.get("saleDetails");
    	List<T> list = jsonArray == null ? null : JSON.parseArray(jsonArray.toJSONString(), classes);
    	return list;
	}

}
