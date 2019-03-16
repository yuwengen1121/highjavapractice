package com.gpedu.practice.designmode.prototype;

import java.io.Serializable;

/**
 * Created by Heavin on 2019/3/15.
 * Des
 */
public class FM implements Serializable {
    private  String fmName;

    public String getFmName() {
        return fmName;
    }

    public void setFmName(String fmName) {
        this.fmName = fmName;
    }
}
