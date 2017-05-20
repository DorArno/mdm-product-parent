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
  * 创建日期：2017-4-30
  * </pre>
  */

package com.einwin.mdm.order.mapper;

import com.einwin.framework.mapper.GenericMapper;
import com.einwin.mdm.order.model.Productorder;

import org.apache.ibatis.annotations.Mapper;

/**
 * <pre>
 * 数据访问接口
 * </pre>
 */
@Mapper
public interface ProductorderMapper extends GenericMapper<Productorder, String> {
}