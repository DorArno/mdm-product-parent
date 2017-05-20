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
 * 数据库表名称：GrouponOrder
 * </pre>
 */
public class Grouponorder extends GenericModel<String> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 
     * 
     * 数据库字段信息:OrderNum VARCHAR(36)
     */
    private String ordernum;

    /**
     * 
     * 
     * 数据库字段信息:StatusCode VARCHAR(36)
     */
    private String statuscode;

    /**
     * 
     * 
     * 数据库字段信息:GrouponId VARCHAR(36)
     */
    private String grouponid;

    /**
     * 
     * 
     * 数据库字段信息:CustomerId VARCHAR(36)
     */
    private String customerid;

    /**
     * 
     * 
     * 数据库字段信息:OrderType INT(10)
     */
    private Long ordertype;

    /**
     * 
     * 
     * 数据库字段信息:PlatformCode VARCHAR(36)
     */
    private String platformcode;

    /**
     * 
     * 
     * 数据库字段信息:RecieverName VARCHAR(50)
     */
    private String recievername;

    /**
     * 
     * 
     * 数据库字段信息:RecieverPhoneNumber VARCHAR(20)
     */
    private String recieverphonenumber;

    /**
     * 
     * 
     * 数据库字段信息:RecieveAddress VARCHAR(200)
     */
    private String recieveaddress;

    /**
     * 
     * 
     * 数据库字段信息:UnitPrice DECIMAL(18,2)
     */
    private Double unitprice;

    /**
     * 
     * 
     * 数据库字段信息:OrderCount INT(10)
     */
    private Long ordercount;

    /**
     * 
     * 
     * 数据库字段信息:SumPrice DECIMAL(18,2)
     */
    private Double sumprice;

    /**
     * 
     * 
     * 数据库字段信息:Subscription DECIMAL(18,2)
     */
    private Double subscription;

    /**
     * 
     * 
     * 数据库字段信息:SpareMoney DECIMAL(18,2)
     */
    private Double sparemoney;

    /**
     * 
     * 
     * 数据库字段信息:SpareMoneyOrderNum VARCHAR(100)
     */
    private String sparemoneyordernum;

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
     * 数据库字段信息:Remark VARCHAR(255)
     */
    private String remark;

    /**
     * 
     * 
     * 数据库字段信息:CommunityId VARCHAR(36)
     */
    private String communityid;

    /**
     * 
     * 
     * 数据库字段信息:TagName VARCHAR(200)
     */
    private String tagname;

    /**
     * 
     * 
     * 数据库字段信息:PointAmount DECIMAL(18,4)
     */
    private Double pointamount;

    /**
     * 
     * 
     * 数据库字段信息:CouponsPrice DECIMAL(18,4)
     */
    private Double couponsprice;

    /**
     * 
     * 
     * 数据库字段信息:PromotionPrice DECIMAL(18,4)
     */
    private Double promotionprice;

    /**
     * 
     * 
     * 数据库字段信息:Logistics VARCHAR(50)
     */
    private String logistics;

    /**
     * 
     * 
     * 数据库字段信息:LogisticsNo VARCHAR(100)
     */
    private String logisticsno;

    /**
     * 
     * 
     * 数据库字段信息:IsDeleted BIT(1)
     */
    private boolean isdeleted;

    /**
     * 
     * 
     * 数据库字段信息:CreatedBy VARCHAR(36)
     */
    private String createdby;

    /**
     * 
     * 
     * 数据库字段信息:CreatedOn DATETIME(19)
     */
    private Timestamp createdon;

    /**
     * 
     * 
     * 数据库字段信息:ModifiedBy VARCHAR(36)
     */
    private String modifiedby;

    /**
     * 
     * 
     * 数据库字段信息:ModifiedOn DATETIME(19)
     */
    private Timestamp modifiedon;

    /**
     * 
     * 
     * 数据库字段信息:RowVersion TIMESTAMP(19)
     */
    private Timestamp rowversion;

    public Grouponorder() {
    }	
    public String getOrdernum() {
        return this.ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum;
    }
	
    public String getStatuscode() {
        return this.statuscode;
    }

    public void setStatuscode(String statuscode) {
        this.statuscode = statuscode;
    }
	
    public String getGrouponid() {
        return this.grouponid;
    }

    public void setGrouponid(String grouponid) {
        this.grouponid = grouponid;
    }
	
    public String getCustomerid() {
        return this.customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }
	
    public Long getOrdertype() {
        return this.ordertype;
    }

    public void setOrdertype(Long ordertype) {
        this.ordertype = ordertype;
    }
	
    public String getPlatformcode() {
        return this.platformcode;
    }

    public void setPlatformcode(String platformcode) {
        this.platformcode = platformcode;
    }
	
    public String getRecievername() {
        return this.recievername;
    }

    public void setRecievername(String recievername) {
        this.recievername = recievername;
    }
	
    public String getRecieverphonenumber() {
        return this.recieverphonenumber;
    }

    public void setRecieverphonenumber(String recieverphonenumber) {
        this.recieverphonenumber = recieverphonenumber;
    }
	
    public String getRecieveaddress() {
        return this.recieveaddress;
    }

    public void setRecieveaddress(String recieveaddress) {
        this.recieveaddress = recieveaddress;
    }
	
    public Double getUnitprice() {
        return this.unitprice;
    }

    public void setUnitprice(Double unitprice) {
        this.unitprice = unitprice;
    }
	
    public Long getOrdercount() {
        return this.ordercount;
    }

    public void setOrdercount(Long ordercount) {
        this.ordercount = ordercount;
    }
	
    public Double getSumprice() {
        return this.sumprice;
    }

    public void setSumprice(Double sumprice) {
        this.sumprice = sumprice;
    }
	
    public Double getSubscription() {
        return this.subscription;
    }

    public void setSubscription(Double subscription) {
        this.subscription = subscription;
    }
	
    public Double getSparemoney() {
        return this.sparemoney;
    }

    public void setSparemoney(Double sparemoney) {
        this.sparemoney = sparemoney;
    }
	
    public String getSparemoneyordernum() {
        return this.sparemoneyordernum;
    }

    public void setSparemoneyordernum(String sparemoneyordernum) {
        this.sparemoneyordernum = sparemoneyordernum;
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
	
    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
	
    public String getCommunityid() {
        return this.communityid;
    }

    public void setCommunityid(String communityid) {
        this.communityid = communityid;
    }
	
    public String getTagname() {
        return this.tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname;
    }
	
    public Double getPointamount() {
        return this.pointamount;
    }

    public void setPointamount(Double pointamount) {
        this.pointamount = pointamount;
    }
	
    public Double getCouponsprice() {
        return this.couponsprice;
    }

    public void setCouponsprice(Double couponsprice) {
        this.couponsprice = couponsprice;
    }
	
    public Double getPromotionprice() {
        return this.promotionprice;
    }

    public void setPromotionprice(Double promotionprice) {
        this.promotionprice = promotionprice;
    }
	
    public String getLogistics() {
        return this.logistics;
    }

    public void setLogistics(String logistics) {
        this.logistics = logistics;
    }
	
    public String getLogisticsno() {
        return this.logisticsno;
    }

    public void setLogisticsno(String logisticsno) {
        this.logisticsno = logisticsno;
    }
	
    public boolean getIsdeleted() {
        return this.isdeleted;
    }

    public void setIsdeleted(boolean isdeleted) {
        this.isdeleted = isdeleted;
    }
	
    public String getCreatedby() {
        return this.createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }
	
    public Timestamp getCreatedon() {
        return this.createdon;
    }

    public void setCreatedon(Timestamp createdon) {
        this.createdon = createdon;
    }
	
    public String getModifiedby() {
        return this.modifiedby;
    }

    public void setModifiedby(String modifiedby) {
        this.modifiedby = modifiedby;
    }
	
    public Timestamp getModifiedon() {
        return this.modifiedon;
    }

    public void setModifiedon(Timestamp modifiedon) {
        this.modifiedon = modifiedon;
    }
	
    public Timestamp getRowversion() {
        return this.rowversion;
    }

    public void setRowversion(Timestamp rowversion) {
        this.rowversion = rowversion;
    }
}