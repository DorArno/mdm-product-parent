/**   
 * Copyright © 2016 Arvato. All rights reserved.
 * 
 * @Title: RedisKeyConstants.java 
 * @Prject: mdm-common
 * @Package: com.mdm.constants 
 * @Description: TODO
 * @author: guox005   
 * @date: 2016年9月27日 上午11:42:32 
 * @version: V1.0   
 */
package com.einwin.mdm.order.bean.constants;

/** 
 * @ClassName: RedisKeyConstants 
 * @Description: 存放所有Redis缓存中的Key
 * @author: guox005
 * @date: 2016年9月27日 上午11:42:32  
 */
public class RedisKeyConstants {
	//前缀
    public static final String PREFIX = "MDM_";

	public static final String MDM_USER = PREFIX + "USER_";
	public static final String MDM_ROLE = PREFIX + "ROLE_";
	public static final String MDM_DISTRICT = PREFIX + "DISTRICT_";
}
