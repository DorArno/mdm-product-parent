/**************************************************************************/
/*                                                                        */
/* Copyright (c) 2017 CCPG Company                                       */
/* 长城物业集团股份有限公司版权所有                                           */
/*                                                                        */
/* PROPRIETARY RIGHTS of CCPG Company are involved in the                */
/* subject matter of this material. All manufacturing, reproduction, use, */
/* and sales rights pertaining to this subject matter are governed by the */
/* license agreement. The recipient of this software implicitly accepts   */
/* the terms of the license.                                              */
/* 本软件文档资料是长城物业集团股份有限公司的资产，任何人士阅读和                   */
/* 使用本资料必须获得相应的书面授权，承担保密责任和接受相应的法律约束。                 */
/*                                                                        */
/**************************************************************************/

/**
  * <pre>
  * 作   者：Allison
  * 创建日期：2017-5-4
  * </pre>
  */

package com.einwin.mdm.order.model;

import java.sql.Timestamp;
import java.io.Serializable;
import java.sql.Date;

import com.einwin.framework.model.GenericModel;

/**
 * <pre>
 * 实体类
 * 数据库表名称：ProductOrder
 * </pre>
 */
public class Productorder extends GenericModel<String> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 
     * 
     * 数据库字段信息:PlatformCode VARCHAR(36)
     */
    private String platformcode;

    /**
     * 
     * 
     * 数据库字段信息:SellerType INT(10)
     */
    private Long sellertype;

    /**
     * 
     * 
     * 数据库字段信息:SellerId VARCHAR(36)
     */
    private String sellerid;

    /**
     * 
     * 
     * 数据库字段信息:CustomerId VARCHAR(36)
     */
    private String customerid;

    /**
     * 
     * 
     * 数据库字段信息:CommunityId VARCHAR(36)
     */
    private String communityid;

    /**
     * 
     * 
     * 数据库字段信息:Consignee VARCHAR(50)
     */
    private String consignee;

    /**
     * 
     * 
     * 数据库字段信息:Address VARCHAR(500)
     */
    private String address;

    /**
     * 
     * 
     * 数据库字段信息:PostCode VARCHAR(20)
     */
    private String postcode;

    /**
     * 
     * 
     * 数据库字段信息:Telphone VARCHAR(20)
     */
    private String telphone;

    /**
     * 
     * 
     * 数据库字段信息:Email VARCHAR(50)
     */
    private String email;

    /**
     * 
     * 
     * 数据库字段信息:OrderStatusCode VARCHAR(36)
     */
    private String orderstatuscode;

    /**
     * 
     * 
     * 数据库字段信息:PaymentStatusCode VARCHAR(36)
     */
    private String paymentstatuscode;

    /**
     * 
     * 
     * 数据库字段信息:PaymentMethodTypeCode VARCHAR(36)
     */
    private String paymentmethodtypecode;

    /**
     * 
     * 
     * 数据库字段信息:PointAmount DECIMAL(18,4)
     */
    private Double pointamount;

    /**
     * 
     * 
     * 数据库字段信息:OrderTotal DECIMAL(18,4)
     */
    private Double ordertotal;

    /**
     * 
     * 
     * 数据库字段信息:CouponsTotal DECIMAL(18,4)
     */
    private Double couponstotal;

    /**
     * 
     * 
     * 数据库字段信息:PromotionTotal DECIMAL(18,4)
     */
    private Double promotiontotal;

    /**
     * 
     * 
     * 数据库字段信息:IsDelayedDelivery BIT(1)
     */
    private boolean isdelayeddelivery;

    /**
     * 
     * 
     * 数据库字段信息:PaymentDate DATETIME(19)
     */
    private Timestamp paymentdate;

    /**
     * 
     * 
     * 数据库字段信息:IsDeleted BIT(1)
     */
    private boolean isdeleted;

    /**
     * 
     * 
     * 数据库字段信息:CreatedOn DATETIME(19)
     */
    private Timestamp createdon;

    /**
     * 
     * 
     * 数据库字段信息:CreatedBy VARCHAR(36)
     */
    private String createdby;

    /**
     * 
     * 
     * 数据库字段信息:ModifiedOn DATETIME(19)
     */
    private Timestamp modifiedon;

    /**
     * 
     * 
     * 数据库字段信息:ModifiedBy VARCHAR(36)
     */
    private String modifiedby;
    
    
    private String ordernumber;
    
	public String getOrdernumber() {
		return ordernumber;
	}
	public void setOrdernumber(String ordernumber) {
		this.ordernumber = ordernumber;
	}

	/**
     * 
     * 
     * 数据库字段信息:RowVersion TIMESTAMP(19)
     */
    private Timestamp rowversion;

    public Productorder() {
    }	
    public String getPlatformcode() {
        return this.platformcode;
    }

    public void setPlatformcode(String platformcode) {
        this.platformcode = platformcode;
    }
	
    public Long getSellertype() {
        return this.sellertype;
    }

    public void setSellertype(Long sellertype) {
        this.sellertype = sellertype;
    }
	
    public String getSellerid() {
        return this.sellerid;
    }

    public void setSellerid(String sellerid) {
        this.sellerid = sellerid;
    }
	
    public String getCustomerid() {
        return this.customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }
	
    public String getCommunityid() {
        return this.communityid;
    }

    public void setCommunityid(String communityid) {
        this.communityid = communityid;
    }
	
    public String getConsignee() {
        return this.consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }
	
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
	
    public String getPostcode() {
        return this.postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
	
    public String getTelphone() {
        return this.telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }
	
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
	
    public String getOrderstatuscode() {
        return this.orderstatuscode;
    }

    public void setOrderstatuscode(String orderstatuscode) {
        this.orderstatuscode = orderstatuscode;
    }
	
    public String getPaymentstatuscode() {
        return this.paymentstatuscode;
    }

    public void setPaymentstatuscode(String paymentstatuscode) {
        this.paymentstatuscode = paymentstatuscode;
    }
	
    public String getPaymentmethodtypecode() {
        return this.paymentmethodtypecode;
    }

    public void setPaymentmethodtypecode(String paymentmethodtypecode) {
        this.paymentmethodtypecode = paymentmethodtypecode;
    }
	
    public Double getPointamount() {
        return this.pointamount;
    }

    public void setPointamount(Double pointamount) {
        this.pointamount = pointamount;
    }
	
    public Double getOrdertotal() {
        return this.ordertotal;
    }

    public void setOrdertotal(Double ordertotal) {
        this.ordertotal = ordertotal;
    }
	
    public Double getCouponstotal() {
        return this.couponstotal;
    }

    public void setCouponstotal(Double couponstotal) {
        this.couponstotal = couponstotal;
    }
	
    public Double getPromotiontotal() {
        return this.promotiontotal;
    }

    public void setPromotiontotal(Double promotiontotal) {
        this.promotiontotal = promotiontotal;
    }
	
    public boolean getIsdelayeddelivery() {
        return this.isdelayeddelivery;
    }

    public void setIsdelayeddelivery(boolean isdelayeddelivery) {
        this.isdelayeddelivery = isdelayeddelivery;
    }
	
    public Timestamp getPaymentdate() {
        return this.paymentdate;
    }

    public void setPaymentdate(Timestamp paymentdate) {
        this.paymentdate = paymentdate;
    }
	
    public boolean getIsdeleted() {
        return this.isdeleted;
    }

    public void setIsdeleted(boolean isdeleted) {
        this.isdeleted = isdeleted;
    }
	
    public Timestamp getCreatedon() {
        return this.createdon;
    }

    public void setCreatedon(Timestamp createdon) {
        this.createdon = createdon;
    }
	
    public String getCreatedby() {
        return this.createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }
	
    public Timestamp getModifiedon() {
        return this.modifiedon;
    }

    public void setModifiedon(Timestamp modifiedon) {
        this.modifiedon = modifiedon;
    }
	
    public String getModifiedby() {
        return this.modifiedby;
    }

    public void setModifiedby(String modifiedby) {
        this.modifiedby = modifiedby;
    }
	
    public Timestamp getRowversion() {
        return this.rowversion;
    }

    public void setRowversion(Timestamp rowversion) {
        this.rowversion = rowversion;
    }
}