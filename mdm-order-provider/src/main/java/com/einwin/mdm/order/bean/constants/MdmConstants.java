package com.einwin.mdm.order.bean.constants;

/**
 * mdm公共常量定义
 * @author gaod003
 *
 */
public class MdmConstants {
	
	public static final Integer IS_NOT_DELETE = 0;
	public static final Integer IS_DELETE = 1;

	public static final Integer USER_NORMAL_STATUS = 1;
	
	public static final String MDM_SWITCH = "MdmSwitch";//mdm 开关总称
	
	public static final String AUTHENTICATION_FLAG = "AuthenticationFlag";//业务系统接入拦截授权开关
	
	public static final String API_LOG_FLAG = "ApiLogFlag";//api日志记录开关
	
	public static final String OPER_AUTH_FLAG = "OperAuthFlag";//MDM按钮功能操作权限开关
	
	public static final String USERMERGE_FLAG = "UserMergeFlag";	//	用户合并开关
	
	public static final String USERORMERGE_FLAG = "UserORMergeFlag";	//	用户组织角色合并开关
	
	public static final String SWITCH_ON = "1"; //开关打开
	
	public static final String SWITCH_OFF = "0";//开关关闭
	
	public static final Integer FLOW_DOWN = 1; //MQ消息-下行
	
	public static final Integer FLOW_UP = 0;//MQ消息上行
	
	 
	//获取下发MQ方式的细类标识
	public static final String MQ_FLAG="MQFlag";
	
	public static final String DEFAULT_PASSWORD = "123456";
	
	public static final String MDM="MDM";//mdm平台系统编码
	
	public static final String ES_District_FLAG = "EsDistrictFlag";//搜索引擎elasticsearch搜索行政区划数据开关
	
	public static final String DISTRICT_REQUEST_MAPPING_URL = "/district";
	public static final String REST_CONTENT_TYPE = "application/json;charset=UTF-8";
	
	//管理员的ID
	public static final String ADMIN_ID="509b5b71-174a-4bac-bce1-7cb2bbda64e7";
	
	public static final Integer SUCCESS = 1;
	

	public static final String CSS="CSS";//物业云-OCRM
	public static final String SAAS="SAAS";//SAAS平台
	public static final String YB="CSS";//悦帮
	public static final String SFYOFF="SFYOFF";//收费云线下
	public static final String SSY="SSY";//社商云
	public static final String SFYON="SFYON";//收费云线上
	public static final String ACRM="ACRM";//ACRM
	public static final String SCM="SCM";//进销存
	public static final String BMS = "BMS";//
	
	public static final String[] CODES = {"SSY", "CSS", "BMS", "SFYON", "SFYOFF"};
	
	public static final String CCPG = "CCPG";//默认企业代码
	public static final Integer BACKEND = 1;//后端用户
	public static final Integer MEMBER_THREE = 3;//前端会员用户-3
	public static final String ACCOUNT = "account";//类型：用户名
	public static final String PHONE = "phone";//类型：用户名
	public static final String SYSTEMID = "sytemId";//类型：系统id
	public static final String USYSCODE = "usyCode";//类型：usyCode
	
	public static final Integer PHONENUMBERCONFIRMED_ZERO = 0;//用户手机绑定状态：未绑定
	public static final Integer PHONENUMBERCONFIRMED_ONE = 1;//用户手机绑定状态：已绑定
	public static final Integer PHONENUMBERCONFIRMED_TWO = 2;//用户手机绑定状态：解绑
}
