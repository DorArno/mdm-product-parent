package com.einwin.mdm.order.service;

import java.sql.Timestamp;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;

import com.einwin.framework.mapper.GenericMapper;
import com.einwin.framework.model.GenericModel;
import com.einwin.framework.model.ResponseCode;
import com.einwin.framework.service.GenericService;
import com.einwin.mdm.order.mapper.ExceptionMapper;

public class OrderService<T, PK> extends GenericService<T, PK>{
	
	protected ExceptionMapper exceptionMapper;
	
	public OrderService(GenericMapper genericMapper,ExceptionMapper exceptionMapper) {
		super(genericMapper);
		this.exceptionMapper = exceptionMapper;
	}

	protected static final Logger logger = LoggerFactory.getLogger(OrderService.class);

	public int insert(T data,String message) {
		int result = 0;
		try {
			setDefault(data);
			result = genericMapper.insert(data);
		} 
		catch(DuplicateKeyException e){}
		catch (Exception e) {
			logger.error(ResponseCode.INSERT_EXCEPTION.getMessage(), e);
			exceptionMapper.insert(message);
			throw e;
		}
		return result;
	}

	
    private void setDefault(T data) {
        if (data instanceof GenericModel) {
            GenericModel model = (GenericModel) data;
            boolean isNew = model.getId() == null;

            if (isNew) {
                if (model.getCreationDate() == null) {
                    model.setCreationDate(new Timestamp(new Date().getTime()));
                }
            }

            if (model.getUpdationDate() == null) {
                model.setUpdationDate(new Timestamp(new Date().getTime()));
            }

            if (model.getEnabledFlag() == null) {
                model.setEnabledFlag(1L);
            }
        }
    }
}
