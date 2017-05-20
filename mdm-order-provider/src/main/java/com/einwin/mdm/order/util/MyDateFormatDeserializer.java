package com.einwin.mdm.order.util;

import java.lang.reflect.Type;
import java.text.SimpleDateFormat;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.deserializer.DateFormatDeserializer;

public class MyDateFormatDeserializer extends DateFormatDeserializer {

        private String myFormat;

        public MyDateFormatDeserializer(String myFormat) {
            super();
            this.myFormat = myFormat;
        }
        
        public static MyDateFormatDeserializer getInstance(){
        	return new MyDateFormatDeserializer("yyyy-MM-dd'T'HH:mm:ss.mmm");
        }

        @Override
        protected <Date> Date cast(DefaultJSONParser parser, Type clazz, Object fieldName, Object val) {
            if (myFormat == null) {
                return null;
            }
            if (val instanceof String) {
                String strVal = (String) val;
                if (strVal.length() == 0) {
                    return null;
                }
                try{
	                switch(strVal.length()){
		                case 23:{
		                	return (Date) new SimpleDateFormat(myFormat).parse((String)val);
		                }
		                case 22:{
		                	return (Date) new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.mm").parse((String)val);
		                }
		                case 19:{
		                	return (Date) new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse((String)val);
		                }
	                }
                }
                catch(Exception e){
                	throw new JSONException("parse error");
                }
            }
            return null;
        }
    }