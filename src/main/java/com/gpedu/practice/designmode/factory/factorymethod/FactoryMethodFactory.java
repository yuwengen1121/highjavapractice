package com.gpedu.practice.designmode.factory.factorymethod;

import com.gpedu.practice.designmode.factory.ICar;

/**
 * Created by Heavin on 2019/3/12.
 * Des 工厂方法模式
 */
public class FactoryMethodFactory  {

    public  ICar newInstance(ICarFactory iCarFactory){
        ICar iCar = iCarFactory.newInstance();
        return iCar;
    }

}
