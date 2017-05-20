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
 * 数据库表名称：OrderItem
 * </pre>
 */
public class Orderitem extends GenericModel<String> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 
     * 
     * 数据库字段信息:OrderId VARCHAR(36)
     */
    private String orderid;

    /**
     * 
     * 
     * 数据库字段信息:SKUId VARCHAR(36)
     */
    private String skuid;

    /**
     * 
     * 
     * 数据库字段信息:ProductId VARCHAR(36)
     */
    private String productid;

    /**
     * 
     * 
     * 数据库字段信息:ProductName VARCHAR(200)
     */
    private String productname;

    /**
     * 
     * 
     * 数据库字段信息:Quantity INT(10)
     */
    private Long quantity;

    /**
     * 
     * 
     * 数据库字段信息:UnitPrice DECIMAL(18,4)
     */
    private Double unitprice;

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
     * 数据库字段信息:IsReturn BIT(1)
     */
    private boolean isreturn;

    /**
     * 
     * 
     * 数据库字段信息:ReturnNum INT(10)
     */
    private Long returnnum;

    /**
     * 
     * 
     * 数据库字段信息:OrderStatuCode VARCHAR(36)
     */
    private String orderstatucode;

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

    public Orderitem() {
    }	
    public String getOrderid() {
        return this.orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }
	
    public String getSkuid() {
        return this.skuid;
    }

    public void setSkuid(String skuid) {
        this.skuid = skuid;
    }
	
    public String getProductid() {
        return this.productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }
	
    public String getProductname() {
        return this.productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }
	
    public Long getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
	
    public Double getUnitprice() {
        return this.unitprice;
    }

    public void setUnitprice(Double unitprice) {
        this.unitprice = unitprice;
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
	
    public boolean getIsreturn() {
        return this.isreturn;
    }

    public void setIsreturn(boolean isreturn) {
        this.isreturn = isreturn;
    }
	
    public Long getReturnnum() {
        return this.returnnum;
    }

    public void setReturnnum(Long returnnum) {
        this.returnnum = returnnum;
    }
	
    public String getOrderstatucode() {
        return this.orderstatucode;
    }

    public void setOrderstatucode(String orderstatucode) {
        this.orderstatucode = orderstatucode;
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
}