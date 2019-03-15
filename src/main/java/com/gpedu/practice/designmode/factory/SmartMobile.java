package com.gpedu.practice.designmode.factory;

import java.awt.image.ImageConsumer;

/**
 * Created by Heavin on 2019/3/12.
 * Des 只能手机
 */
public class SmartMobile implements IMobile {

    public SmartMobile() {
        System.out.println("智能手机构造方法");
    }

    @Override
    public void dial() {
        System.out.println("使用智能手机开启人生巅峰拨打电话。。。");
    }
}
