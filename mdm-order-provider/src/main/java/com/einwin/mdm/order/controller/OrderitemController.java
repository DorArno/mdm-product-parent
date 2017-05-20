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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.einwin.mdm.order.model.Orderitem;
import com.einwin.mdm.order.service.OrderitemService;

/**
 * <pre>
 * 表现层控制类
 * </pre>
 */
//@RefreshScope
//@RequestMapping(value = "/order/orderitem")
@RestController
public class OrderitemController {
    private static final Logger logger = LoggerFactory.getLogger(OrderitemController.class);
    
//    @Autowired
//    private OrderitemService orderitemService;
//
//    //@PropertyFiltration(clazz = Orderitem.class, excludes = {"updationDate", "enabledFlag"}, includes = {"createdBy"})
//    @RequestMapping("/GetOrder")
//    public Orderitem getOrder(@RequestBody Orderitem orderItem) {
//        Orderitem orderitem = null;
//        orderitem = orderitemService.get(null);
//        return orderitem;
//    }
//
//    @RequestMapping("")
//    public Orderitem getOrders(@RequestBody Orderitem orderitm){
//    	return  null;
//    }
}