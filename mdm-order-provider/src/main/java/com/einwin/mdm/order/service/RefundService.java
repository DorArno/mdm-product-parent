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
  * 创建日期：2017-5-3
  * </pre>
  */

package com.einwin.mdm.order.service;

import com.einwin.framework.model.Pagination;
import com.einwin.framework.service.PaginationCallback;
import com.einwin.mdm.order.bo.RefundBO;
import com.einwin.mdm.order.model.MDMPagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.einwin.mdm.order.mapper.ExceptionMapper;
import com.einwin.mdm.order.mapper.RefundMapper;
import com.einwin.mdm.order.model.Refund;

import java.util.List;

/**
 * MDM主数据平台二期－退换货服务
 * date:2017-05-16
 */
@Service("refundService")
public class RefundService extends OrderService<Refund, String> {
    /**
     * 构造器
     * @param refundMapper 退换货数据库映射
     * @param exceptionMapper 错误信息数据库映射
     */
    public RefundService(@Autowired RefundMapper refundMapper,@Autowired ExceptionMapper exceptionMapper) {
        super(refundMapper,exceptionMapper);
    }
    
    public RefundMapper getMapper() {
        return (RefundMapper) super.genericMapper;
    }

    /**
     * 查询退换器数据
     * @param page 分页（退换货实体类）
     */
    public MDMPagination<Refund> queryRefundList(MDMPagination<Refund> page) {
        executePagination((pages)->getMapper().query((RefundBO)page.getCriteria()),page);
        return page;
    }
}