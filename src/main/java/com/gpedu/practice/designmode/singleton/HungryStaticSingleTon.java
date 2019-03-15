package com.gpedu.practice.designmode.singleton;

/**
 * Created by Heavin on 2019/3/14.
 * Des 饿汉式 静态 单例模式
 */
public class HungryStaticSingleTon {

    static {
        instance = new HungryStaticSingleTon();
    }


    private static HungryStaticSingleTon instance = null;

    private HungryStaticSingleTon() {

    }

    public static HungryStaticSingleTon getInstance() {

        return instance;
    }

}
