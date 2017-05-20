package com.einwin.mdm.order.bo;

import com.einwin.framework.model.GenericBO;

import java.sql.Timestamp;

/**
 * Created by lupen on 2017/5/16.
 */
public class RefundBO extends GenericBO {

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


    private String ordernumber;

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

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public Long getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(Long ordertype) {
        this.ordertype = ordertype;
    }

    public String getOrderitemid() {
        return orderitemid;
    }

    public void setOrderitemid(String orderitemid) {
        this.orderitemid = orderitemid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Double getRefundfee() {
        return refundfee;
    }

    public void setRefundfee(Double refundfee) {
        this.refundfee = refundfee;
    }

    public String getRefundtype() {
        return refundtype;
    }

    public void setRefundtype(String refundtype) {
        this.refundtype = refundtype;
    }

    public Long getRefundnum() {
        return refundnum;
    }

    public void setRefundnum(Long refundnum) {
        this.refundnum = refundnum;
    }

    public String getRefundordernum() {
        return refundordernum;
    }

    public void setRefundordernum(String refundordernum) {
        this.refundordernum = refundordernum;
    }

    public String getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(String statuscode) {
        this.statuscode = statuscode;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getCustomertel() {
        return customertel;
    }

    public void setCustomertel(String customertel) {
        this.customertel = customertel;
    }

    public Long getRefundapplytype() {
        return refundapplytype;
    }

    public void setRefundapplytype(Long refundapplytype) {
        this.refundapplytype = refundapplytype;
    }

    public String getPaytypecode() {
        return paytypecode;
    }

    public void setPaytypecode(String paytypecode) {
        this.paytypecode = paytypecode;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public Timestamp getModifiedon() {
        return modifiedon;
    }

    public void setModifiedon(Timestamp modifiedon) {
        this.modifiedon = modifiedon;
    }

    public String getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(String modifiedby) {
        this.modifiedby = modifiedby;
    }

    public boolean isIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(boolean isdeleted) {
        this.isdeleted = isdeleted;
    }

    public Timestamp getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Timestamp createdon) {
        this.createdon = createdon;
    }

    public Timestamp getRowversion() {
        return rowversion;
    }

    public void setRowversion(Timestamp rowversion) {
        this.rowversion = rowversion;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }
}
