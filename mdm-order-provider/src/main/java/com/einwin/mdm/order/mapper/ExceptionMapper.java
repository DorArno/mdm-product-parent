package com.einwin.mdm.order.mapper;

import java.util.List;

import com.einwin.framework.mapper.GenericMapper;
import com.einwin.mdm.order.model.Grouponorder;
import org.apache.ibatis.annotations.Mapper;

import com.einwin.mdm.order.model.OrderExceptionInfo;

@Mapper
public interface ExceptionMapper extends GenericMapper<OrderExceptionInfo, String> {
	
	void insert(String message);
	
	List<OrderExceptionInfo> get();

}
