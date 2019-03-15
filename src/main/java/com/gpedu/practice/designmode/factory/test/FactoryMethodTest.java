package com.gpedu.practice.designmode.factory.test;

import com.gpedu.practice.designmode.factory.ICar;
import com.gpedu.practice.designmode.factory.factorymethod.*;
import org.apache.juli.logging.LogFactory;
import org.slf4j.ILoggerFactory;

import java.util.Calendar;

/**
 * Created by Heavin on 2019/3/12.
 * Des 工厂方法模式测试
 */
public class FactoryMethodTest {

    public static void main(String[] args) {

        FactoryMethodFactory factoryMethodFactory = new FactoryMethodFactory();


        ICar bike = factoryMethodFactory.newInstance(new BikeFactory());
        new BikeFactory().preNewInstance();
        bike.drive();
        ICar smallCar = factoryMethodFactory.newInstance(new SmallCarFactory());
        smallCar.drive();
        ICar suvCar = factoryMethodFactory.newInstance(new SuvCarFactory());
        suvCar.drive();

        System.out.println(bike);
        System.out.println(smallCar);
        System.out.println(suvCar);

        Calendar calendar = Calendar.getInstance();
        System.out.println("Calendar 就是jdk中的一个工厂模式");
        System.out.println(calendar.toString());

    }

}
