package com.gpedu.practice.designmode.singleton;

/**
 * Created by Heavin on 2019/3/14.
 * Des 饿汉式单例模式
 */
public class HungrySingleTon {


    private static final HungrySingleTon instance = new HungrySingleTon();

    private HungrySingleTon() {

    }

    public static HungrySingleTon getInstance() {

        return instance;
    }

}
