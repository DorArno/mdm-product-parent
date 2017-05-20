package com.einwin.mdm.order.api.controller;

import com.einwin.mdm.order.bo.RefundBO;
import com.einwin.mdm.order.model.MDMPagination;
import com.einwin.mdm.order.model.Refund;
import com.einwin.mdm.order.service.RefundOrderService;
import com.einwin.mdm.order.service.RefundService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 退换货订单查询接口（API）
 * Created by lupen on 2017/5/17.
 */
@RefreshScope
@RestController
public class APIRefundOrderController implements RefundOrderService {

    @Autowired
    private RefundService refundService;

    /**
     * 查询退换货信息接口（API）
     *
     * @param queryParam 退换货查询条件
     *                   订单号：
     *                   退换货单号：
     *                   订单类型：
     *                   退换货类型：
     *                   退换货开始时间：
     *                   退换化结束时间：
     * @return 分页后的退换货集合类实体信息
     */
    @Override
    public MDMPagination<Refund> queryRefundList(@RequestBody RefundBO queryParam) {
        MDMPagination<Refund> page = new MDMPagination<Refund>();
        page.setPageSize(queryParam.getPageSize());
        page.setPage(queryParam.getPage());
        page.setCriteria(queryParam);
        return this.refundService.queryRefundList(page);
    }

    /**
     * 退换货数据新增接口（API）
     * @param refundBO 实体信息
     *                 注意：主数据保存时会使用传入ID做为主键，调用接口需保证主键全局唯一
     */
    @Override
    public void addRefundOrder(@RequestBody RefundBO refundBO) {
        Refund refund = new Refund();
        BeanUtils.copyProperties(refundBO,refund);
        refundService.insert(refund);
    }
}
