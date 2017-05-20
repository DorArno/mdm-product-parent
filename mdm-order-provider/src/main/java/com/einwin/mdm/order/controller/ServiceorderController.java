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

package com.einwin.mdm.order.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.einwin.mdm.order.model.Serviceorder;
import com.einwin.mdm.order.service.ServiceorderService;

/**
 * <pre>
 * 表现层控制类
 * </pre>
 */
//@RefreshScope
//@RestController
//@RequestMapping(value = "/order/serviceorder")
public class ServiceorderController {
    private static final Logger logger = LoggerFactory.getLogger(ServiceorderController.class);
    
    @Autowired
    private ServiceorderService serviceorderService;

    //@PropertyFiltration(clazz = Serviceorder.class, excludes = {"updationDate", "enabledFlag"}, includes = {"createdBy"})
    @RequestMapping("/{id}")
    public Serviceorder get(@PathVariable("id") String id) {
        Serviceorder serviceorder = null;
        serviceorder = serviceorderService.get(id);

        return serviceorder;
    }
}