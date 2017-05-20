package com.einwin.mdm.order.model;


import com.einwin.framework.model.Pagination;

/**
 * Created by lupen on 2017/5/18.
 */
public class MDMPagination<T> extends Pagination<T> {

    private int resCode = 200;

    public int getResCode() {
        return resCode;
    }

    public void setResCode(int resCode) {
        this.resCode = resCode;
    }
}
