package com.gpedu.practice.designmode.factory;

/**
 * Created by Heavin on 2019/3/12.
 * Des
 */
public class SmallCar implements ICar {

    public SmallCar() {
        System.out.println("小车构造方法");
    }

    @Override
    public void drive() {
        System.out.println("兴高采烈的开小车");
    }
}
