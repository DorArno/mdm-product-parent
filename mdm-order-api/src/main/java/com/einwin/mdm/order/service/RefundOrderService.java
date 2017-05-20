package com.einwin.mdm.order.service;



import com.einwin.mdm.order.bo.RefundBO;
import com.einwin.mdm.order.model.MDMPagination;
import com.einwin.mdm.order.model.Refund;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by henry on 2017/1/22.
 */
public interface RefundOrderService {

    /**
     * 退换货查询接口
     * @param queryParam
     * @return
     */
    @RequestMapping(value = "/api/refund/refundInfos", method = RequestMethod.POST)
    MDMPagination<Refund> queryRefundList(@RequestBody RefundBO queryParam);

    /**
     * 退换货新增数接口
     * @param refundBO
     */
    @RequestMapping(value = "/api/refund/add", method = RequestMethod.POST)
    void addRefundOrder(@RequestBody RefundBO refundBO);

}
