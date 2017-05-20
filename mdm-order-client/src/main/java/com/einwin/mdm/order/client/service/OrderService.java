package com.einwin.mdm.order.client.service;

import com.einwin.mdm.order.OrderInterface;
import com.einwin.mdm.order.model.Productorder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by henry on 2017/1/22.
 */
@FeignClient(name = OrderInterface.SERVICE_NAME, fallback = OrderService.HystrixClientFallback.class)
public interface OrderService extends OrderRemoteService {
    @Component
    public static class HystrixClientFallback implements OrderService {
        private static final Logger LOG = LoggerFactory.getLogger(HystrixClientFallback.class);

        @Override
        public Productorder get(@PathVariable("orderId") String orderId) {
            return null;
        }

        @Override
        public Productorder getfromCache(@PathVariable("orderId") String orderId) {
            return null;
        }

        @Override
        public int insert(@RequestBody Productorder order) {
            return 0;
        }

        @Override
        public int update(@RequestBody Productorder order) {
            return 0;
        }

        @Override
        public int delete(@PathVariable("orderId") String orderId) {
            return 0;
        }
    }
}