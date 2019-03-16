package com.gpedu.practice.designmode.prototype;

import java.util.Date;

/**
 * Created by Heavin on 2019/3/15.
 * Des
 */
public class Car {

    private String name;

    private Date createTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
