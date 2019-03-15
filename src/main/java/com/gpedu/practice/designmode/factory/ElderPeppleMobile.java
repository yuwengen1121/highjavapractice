package com.gpedu.practice.designmode.factory;

/**
 * Created by Heavin on 2019/3/12.
 * Des 老人机
 */
public class ElderPeppleMobile implements IMobile {

    public ElderPeppleMobile() {
        System.out.println("老人机的构造方法");
    }

    @Override
    public void dial() {
        System.out.println("使用老人机打个电话。。。。");
    }
}
