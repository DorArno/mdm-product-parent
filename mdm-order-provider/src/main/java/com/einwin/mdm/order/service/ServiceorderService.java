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

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.einwin.framework.service.GenericService;
import com.einwin.mdm.order.model.Serviceorder;
import com.einwin.mdm.order.mapper.ExceptionMapper;
import com.einwin.mdm.order.mapper.ServiceorderMapper;

/**
 * <pre>
 * 业务类
 * </pre>
 */
@Service("serviceorderService")
public class ServiceorderService extends OrderService<Serviceorder, String> {
    public ServiceorderService(@Autowired ServiceorderMapper serviceorderMapper,@Autowired ExceptionMapper exceptionMapper) {
        super(serviceorderMapper,exceptionMapper);
    }
    
    public ServiceorderMapper getMapper() {
        return (ServiceorderMapper) super.genericMapper;
    }
}