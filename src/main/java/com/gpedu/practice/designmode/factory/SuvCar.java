package com.gpedu.practice.designmode.factory;

/**
 * Created by Heavin on 2019/3/12.
 * Des
 */
public class SuvCar implements ICar {

    public SuvCar() {
        System.out.println("suv构造方法");
    }

    @Override
    public void drive() {
        System.out.println("喜气洋洋的开着SUV");
    }
}
