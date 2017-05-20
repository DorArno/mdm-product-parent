package com.einwin.mdm.order.controller;

import com.einwin.mdm.logging.api.model.BusinessLog;
import com.einwin.mdm.logging.client.LoggingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * 用来测试MQ 连接发送， 监听
 * Created by Allison on 2017/4/30.
 */
@RestController
@RequestMapping("/test")
public class DemoController {

    @Autowired
    LoggingService loggingService;

    

    //日志测试
    @RequestMapping("/logtest")
    public String logtest(){
        BusinessLog businessLog=new BusinessLog();
        businessLog.setId(UUID.randomUUID().toString());
      loggingService.insertBusinessLog(businessLog);
        return "success";
    }


 

}
