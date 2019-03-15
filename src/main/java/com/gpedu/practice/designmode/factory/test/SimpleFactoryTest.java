package com.gpedu.practice.designmode.factory.test;

import com.gpedu.practice.designmode.factory.CarEnum;
import com.gpedu.practice.designmode.factory.ICar;
import com.gpedu.practice.designmode.factory.simplefactory.SimpleFactory;

/**
 * Created by Heavin on 2019/3/12.
 * Des 简单工厂测试
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        ICar bike = SimpleFactory.newInstance(CarEnum.Bike);
        bike.drive();
        ICar smallCar = SimpleFactory.newInstance(CarEnum.SmallCar);
        smallCar.drive();
        ICar suvCar = SimpleFactory.newInstance(CarEnum.SuvCar);
        suvCar.drive();

        System.out.println(bike);
        System.out.println(smallCar);
        System.out.println(suvCar);


    }

}
