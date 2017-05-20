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
 * 数据库表名称：Refund
 * </pre>
 */
public class Refund extends GenericModel<String> implements Serializable {

    private int page;  //页码

    private int pageSize = 10; //每页记录数

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    private static final long serialVersionUID = 1L;

    /**
     * orddernumbe订单号
     */
    private String ordernumber;
    /**
     * 
     * 
     * 数据库字段信息:OrderId VARCHAR(36)
     */
    private String orderid;

    /**
     * 
     * 
     * 数据库字段信息:OrderType INT(10)
     */
    private Long ordertype;

    /**
     * 
     * 
     * 数据库字段信息:OrderItemId VARCHAR(36)
     */
    private String orderitemid;

    /**
     * 
     * 
     * 数据库字段信息:Remark VARCHAR(500)
     */
    private String remark;

    /**
     * 
     * 
     * 数据库字段信息:RefundFee DECIMAL(18,4)
     */
    private Double refundfee;

    /**
     * 
     * 
     * 数据库字段信息:RefundType VARCHAR(36)
     */
    private String refundtype;

    /**
     * 
     * 
     * 数据库字段信息:RefundNum INT(10)
     */
    private Long refundnum;

    /**
     * 
     * 
     * 数据库字段信息:RefundOrderNum VARCHAR(100)
     */
    private String refundordernum;

    /**
     * 
     * 
     * 数据库字段信息:StatusCode VARCHAR(36)
     */
    private String statuscode;

    /**
     * 
     * 
     * 数据库字段信息:CustomerName VARCHAR(20)
     */
    private String customername;

    /**
     * 
     * 
     * 数据库字段信息:CustomerTel VARCHAR(20)
     */
    private String customertel;

    /**
     * 
     * 
     * 数据库字段信息:RefundApplyType INT(10)
     */
    private Long refundapplytype;

    /**
     * 
     * 
     * 数据库字段信息:PayTypeCode VARCHAR(36)
     */
    private String paytypecode;

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
     * 数据库字段信息:RowVersion TIMESTAMP(19)
     */
    private Timestamp rowversion;

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }

    public Refund() {
    }	
    public String getOrderid() {
        return this.orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }
	
    public Long getOrdertype() {
        return this.ordertype;
    }

    public void setOrdertype(Long ordertype) {
        this.ordertype = ordertype;
    }
	
    public String getOrderitemid() {
        return this.orderitemid;
    }

    public void setOrderitemid(String orderitemid) {
        this.orderitemid = orderitemid;
    }
	
    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
	
    public Double getRefundfee() {
        return this.refundfee;
    }

    public void setRefundfee(Double refundfee) {
        this.refundfee = refundfee;
    }
	
    public String getRefundtype() {
        return this.refundtype;
    }

    public void setRefundtype(String refundtype) {
        this.refundtype = refundtype;
    }
	
    public Long getRefundnum() {
        return this.refundnum;
    }

    public void setRefundnum(Long refundnum) {
        this.refundnum = refundnum;
    }
	
    public String getRefundordernum() {
        return this.refundordernum;
    }

    public void setRefundordernum(String refundordernum) {
        this.refundordernum = refundordernum;
    }
	
    public String getStatuscode() {
        return this.statuscode;
    }

    public void setStatuscode(String statuscode) {
        this.statuscode = statuscode;
    }
	
    public String getCustomername() {
        return this.customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }
	
    public String getCustomertel() {
        return this.customertel;
    }

    public void setCustomertel(String customertel) {
        this.customertel = customertel;
    }
	
    public Long getRefundapplytype() {
        return this.refundapplytype;
    }

    public void setRefundapplytype(Long refundapplytype) {
        this.refundapplytype = refundapplytype;
    }
	
    public String getPaytypecode() {
        return this.paytypecode;
    }

    public void setPaytypecode(String paytypecode) {
        this.paytypecode = paytypecode;
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
	
    public Timestamp getRowversion() {
        return this.rowversion;
    }

    public void setRowversion(Timestamp rowversion) {
        this.rowversion = rowversion;
    }
}