package com.gpedu.practice.designmode.factory.factorymethod;

import com.gpedu.practice.designmode.factory.ICar;
import com.gpedu.practice.designmode.factory.SmallCar;

/**
 * Created by Heavin on 2019/3/12.
 * Des
 */
public class SmallCarFactory extends ICarFactory {
    @Override
    public ICar newInstance() {
        return new SmallCar();
    }
}
