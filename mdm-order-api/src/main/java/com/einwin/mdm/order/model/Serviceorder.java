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
import java.sql.Date;
import java.io.Serializable;

import com.einwin.framework.model.GenericModel;

/**
 * <pre>
 * 实体类
 * 数据库表名称：ServiceOrder
 * </pre>
 */
public class Serviceorder extends GenericModel<String> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 
     * 
     * 数据库字段信息:OrderNumber VARCHAR(50)
     */
    private String ordernumber;

    /**
     * 
     * 
     * 数据库字段信息:ServiceId VARCHAR(36)
     */
    private String serviceid;

    /**
     * 
     * 
     * 数据库字段信息:CustomerId VARCHAR(36)
     */
    private String customerid;

    /**
     * 
     * 
     * 数据库字段信息:ReceiverName VARCHAR(20)
     */
    private String receivername;

    /**
     * 
     * 
     * 数据库字段信息:ReceiverPhoneNumber VARCHAR(20)
     */
    private String receiverphonenumber;

    /**
     * 
     * 
     * 数据库字段信息:ReceiverAddress VARCHAR(100)
     */
    private String receiveraddress;

    /**
     * 
     * 
     * 数据库字段信息:CommunityId VARCHAR(36)
     */
    private String communityid;

    /**
     * 
     * 
     * 数据库字段信息:OrderTime DATETIME(19)
     */
    private Timestamp ordertime;

    /**
     * 
     * 
     * 数据库字段信息:PlatformCode VARCHAR(36)
     */
    private String platformcode;

    /**
     * 
     * 
     * 数据库字段信息:ServiceStaffId VARCHAR(36)
     */
    private String servicestaffid;

    /**
     * 
     * 
     * 数据库字段信息:ServiceStaffName VARCHAR(20)
     */
    private String servicestaffname;

    /**
     * 
     * 
     * 数据库字段信息:ConfirmTime DATETIME(19)
     */
    private Timestamp confirmtime;

    /**
     * 
     * 
     * 数据库字段信息:ServiceTime DATETIME(19)
     */
    private Timestamp servicetime;

    /**
     * 
     * 
     * 数据库字段信息:OrderPrice DECIMAL(18,2)
     */
    private Double orderprice;

    /**
     * 
     * 
     * 数据库字段信息:OrderStatusCode VARCHAR(36)
     */
    private String orderstatuscode;

    /**
     * 
     * 
     * 数据库字段信息:FinishedTime DATETIME(19)
     */
    private Timestamp finishedtime;

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
     * 数据库字段信息:MaterialPay DECIMAL(18,2)
     */
    private Double materialpay;

    /**
     * 
     * 
     * 数据库字段信息:ServiceOrderPay DECIMAL(18,2)
     */
    private Double serviceorderpay;

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
     * 数据库字段信息:PointAmount DECIMAL(18,4)
     */
    private Double pointamount;

    /**
     * 
     * 
     * 数据库字段信息:PreServiceTime DATETIME(19)
     */
    private Timestamp preservicetime;

    /**
     * 
     * 
     * 数据库字段信息:ModifiedOn DATETIME(19)
     */
    private Timestamp modifiedon;

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
     * 数据库字段信息:RowVersion TIMESTAMP(19)
     */
    private Timestamp rowversion;

    public Serviceorder() {
    }	
    public String getOrdernumber() {
        return this.ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }
	
    public String getServiceid() {
        return this.serviceid;
    }

    public void setServiceid(String serviceid) {
        this.serviceid = serviceid;
    }
	
    public String getCustomerid() {
        return this.customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }
	
    public String getReceivername() {
        return this.receivername;
    }

    public void setReceivername(String receivername) {
        this.receivername = receivername;
    }
	
    public String getReceiverphonenumber() {
        return this.receiverphonenumber;
    }

    public void setReceiverphonenumber(String receiverphonenumber) {
        this.receiverphonenumber = receiverphonenumber;
    }
	
    public String getReceiveraddress() {
        return this.receiveraddress;
    }

    public void setReceiveraddress(String receiveraddress) {
        this.receiveraddress = receiveraddress;
    }
	
    public String getCommunityid() {
        return this.communityid;
    }

    public void setCommunityid(String communityid) {
        this.communityid = communityid;
    }
	
    public Timestamp getOrdertime() {
        return this.ordertime;
    }

    public void setOrdertime(Timestamp ordertime) {
        this.ordertime = ordertime;
    }
	
    public String getPlatformcode() {
        return this.platformcode;
    }

    public void setPlatformcode(String platformcode) {
        this.platformcode = platformcode;
    }
	
    public String getServicestaffid() {
        return this.servicestaffid;
    }

    public void setServicestaffid(String servicestaffid) {
        this.servicestaffid = servicestaffid;
    }
	
    public String getServicestaffname() {
        return this.servicestaffname;
    }

    public void setServicestaffname(String servicestaffname) {
        this.servicestaffname = servicestaffname;
    }
	
    public Timestamp getConfirmtime() {
        return this.confirmtime;
    }

    public void setConfirmtime(Timestamp confirmtime) {
        this.confirmtime = confirmtime;
    }
	
    public Timestamp getServicetime() {
        return this.servicetime;
    }

    public void setServicetime(Timestamp servicetime) {
        this.servicetime = servicetime;
    }
	
    public Double getOrderprice() {
        return this.orderprice;
    }

    public void setOrderprice(Double orderprice) {
        this.orderprice = orderprice;
    }
	
    public String getOrderstatuscode() {
        return this.orderstatuscode;
    }

    public void setOrderstatuscode(String orderstatuscode) {
        this.orderstatuscode = orderstatuscode;
    }
	
    public Timestamp getFinishedtime() {
        return this.finishedtime;
    }

    public void setFinishedtime(Timestamp finishedtime) {
        this.finishedtime = finishedtime;
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
	
    public Double getMaterialpay() {
        return this.materialpay;
    }

    public void setMaterialpay(Double materialpay) {
        this.materialpay = materialpay;
    }
	
    public Double getServiceorderpay() {
        return this.serviceorderpay;
    }

    public void setServiceorderpay(Double serviceorderpay) {
        this.serviceorderpay = serviceorderpay;
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
	
    public Double getPointamount() {
        return this.pointamount;
    }

    public void setPointamount(Double pointamount) {
        this.pointamount = pointamount;
    }
	
    public Timestamp getPreservicetime() {
        return this.preservicetime;
    }

    public void setPreservicetime(Timestamp preservicetime) {
        this.preservicetime = preservicetime;
    }
	
    public Timestamp getModifiedon() {
        return this.modifiedon;
    }

    public void setModifiedon(Timestamp modifiedon) {
        this.modifiedon = modifiedon;
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
	
    public Timestamp getRowversion() {
        return this.rowversion;
    }

    public void setRowversion(Timestamp rowversion) {
        this.rowversion = rowversion;
    }
}