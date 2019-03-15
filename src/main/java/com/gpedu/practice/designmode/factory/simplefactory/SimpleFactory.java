package com.gpedu.practice.designmode.factory.simplefactory;

import com.gpedu.practice.designmode.factory.*;

/**
 * Created by Heavin on 2019/3/12.
 * Des 简单工厂模式 ,也叫静态工厂
 */
public class SimpleFactory {

    public static ICar  newInstance(CarEnum carEnum) {
        ICar iCar = null;
        switch (carEnum) {
            case Bike:
                iCar = new Bike();
                break;
            case SuvCar:
                iCar = new SuvCar();
                break;
            case SmallCar:
                iCar = new SmallCar();
                break;

        }

        return iCar;
    }


}
