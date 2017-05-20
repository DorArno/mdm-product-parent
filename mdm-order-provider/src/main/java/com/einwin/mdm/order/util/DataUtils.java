/**   
 * Copyright © 2016 Arvato. All rights reserved.
 * 
 * @Title: DataUtils.java 
 * @Prject: mdm-common
 * @Package: com.mdm.util 
 * @Description: TODO
 * @author: ZHAN526   
 * @date: 2016年9月14日 下午4:02:36 
 * @version: V1.0   
 */
package com.einwin.mdm.order.util;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName: DataUtils
 * @Description: TODO
 * @author: ZHAN526
 * @date: 2016年9月14日 下午4:02:36
 */
public class DataUtils {

	/**
	 * 
	 * @Title: uuid
	 * @Description: 生成唯一id
	 * @return
	 * @return: String
	 */
	public static String uuid() {
		return UUID.randomUUID().toString();
	}

	/**
	 * 生成角色编码
	 * 
	 * @return
	 */
	public static String generateRoleCode() {
		return "R" + RandomStringUtils.randomNumeric(Integer.valueOf(RandomStringUtils.random(1, "45678")));
	}

 
	public static String random(int n) {
		if (n < 1 || n > 10) {
			throw new IllegalArgumentException("cannot random " + n + " bit number");
		}
		Random ran = new Random();
		if (n == 1) {
			return String.valueOf(ran.nextInt(10));
		}
		int bitField = 0;
		char[] chs = new char[n];
		for (int i = 0; i < n; i++) {
			while (true) {
				int k = ran.nextInt(10);
				if ((bitField & (1 << k)) == 0) {
					bitField |= 1 << k;
					chs[i] = (char) (k + '0');
					break;
				}
			}
		}
		return new String(chs);
	}
	
	/**
	 * 
	 * @Title: replaceUuid 
	 * @Description: 将restUrl中的uuid替换成{id}
	 * @param restUrl
	 * @return
	 * @return: String
	 */
	public static String replaceUuid(String restUrl) {
		
		String reg = "[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}";  
		Pattern p=Pattern.compile(reg);  
		Matcher m=p.matcher(restUrl);   
		
	    while (m.find()) { 
	       String temp = restUrl.substring(m.start(),m.end());
	       restUrl = restUrl.replaceAll(temp, "{id}");
	    }     
		
		return restUrl;
	}
 
	
//	public String getVersion(){
//		return System.currentTimeMillis() +"";
//	}
	
	public static void main(String args[]){
		System.out.println(replaceUuid("http://10.11.21.9/mdm_district/district/02727204-24a9-4dE4-82AC-0a4558AFD84A,GET"));
	}
	
}
