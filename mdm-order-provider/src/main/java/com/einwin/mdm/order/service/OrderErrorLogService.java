package com.einwin.mdm.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.einwin.framework.mapper.GenericMapper;
import com.einwin.framework.model.ResponseCode;
import com.einwin.framework.service.GenericService;
import com.einwin.mdm.order.mapper.ExceptionMapper;
import com.einwin.mdm.order.model.OrderExceptionInfo;

@Service("ordererrorlogService")
public class OrderErrorLogService extends GenericService<OrderExceptionInfo, String>{

	public OrderErrorLogService(@Autowired ExceptionMapper  genericMapper) {
		super(genericMapper);
	}
	
    public List<OrderExceptionInfo> get() {
    	List<OrderExceptionInfo> result = null;
        try {
            result = ((ExceptionMapper)genericMapper).get();
        } catch (Exception e) {
            logger.error(ResponseCode.SELECT_ONE_EXCEPTION.getMessage(), e);
        }
        return result;
    }

}
