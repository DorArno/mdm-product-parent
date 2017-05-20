package com.einwin.mdm.order.convert;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public interface Convert {
	
	public String convert(JSONObject rubbiteMQ,JSONObject dataObject,JSONArray jsonArray);

}
