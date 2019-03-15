package com.gpedu.practice.designmode.factory.factorymethod;

import com.gpedu.practice.designmode.factory.Bike;
import com.gpedu.practice.designmode.factory.ICar;

/**
 * Created by Heavin on 2019/3/12.
 * Des 单车工厂
 */
public class BikeFactory extends ICarFactory {

    @Override
    public ICar newInstance() {
        Bike bike = new Bike();
        bike.setName("永久自由车");
        return bike;
    }
}
