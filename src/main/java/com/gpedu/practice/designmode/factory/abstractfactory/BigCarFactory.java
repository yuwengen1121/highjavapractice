package com.gpedu.practice.designmode.factory.abstractfactory;

import com.gpedu.practice.designmode.factory.ICar;
import com.gpedu.practice.designmode.factory.IMobile;
import com.gpedu.practice.designmode.factory.SmartMobile;
import com.gpedu.practice.designmode.factory.SuvCar;

/**
 * Created by Heavin on 2019/3/12.
 * Des 大车工厂
 */
public class BigCarFactory implements IAbstractFactory {

    @Override
    public ICar instanceCar() {
        return new SuvCar();
    }

    @Override
    public IMobile instanceMobile() {
        return new SmartMobile();
    }
}
