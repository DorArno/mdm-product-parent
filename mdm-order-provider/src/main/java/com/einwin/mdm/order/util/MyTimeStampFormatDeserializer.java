package com.einwin.mdm.order.util;

import java.lang.reflect.Type;
import java.sql.Timestamp;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.deserializer.TimestampDeserializer;

public class MyTimeStampFormatDeserializer extends TimestampDeserializer {

        private String myFormat;

        public MyTimeStampFormatDeserializer(String myFormat) {
            super();
            this.myFormat = myFormat;
        }
        
        public static MyTimeStampFormatDeserializer getInstance(){
        	return new MyTimeStampFormatDeserializer("yyyy-MM-dd'T'HH:mm:ss.mmm");
        }

        @Override
        protected Timestamp cast(DefaultJSONParser parser, Type clazz, Object fieldName, Object val) {
            if (myFormat == null) {
                return null;
            }
            if (val instanceof String) {
                String strVal = (String) val;
                if (strVal.length() == 0) {
                    return null;
                }
                if(strVal.length()>23){
                    strVal = strVal.substring(0,22);
                }

                return Timestamp.valueOf((strVal).replace("T", " "));
                }

            
            return null;
        }
    }