package com.gpedu.practice.designmode.factory.test;

import com.gpedu.practice.designmode.factory.abstractfactory.BigCarFactory;
import com.gpedu.practice.designmode.factory.abstractfactory.IAbstractFactory;
import com.gpedu.practice.designmode.factory.abstractfactory.OldCarFactory;

/**
 * Created by Heavin on 2019/3/12.
 * Des
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        IAbstractFactory abstractFactory = new BigCarFactory();
        abstractFactory.instanceCar().drive();
        abstractFactory.instanceMobile().dial();

        IAbstractFactory abstractFactoryOld = new OldCarFactory();
        abstractFactoryOld.instanceCar().drive();
        abstractFactoryOld.instanceMobile().dial();

    }
}
