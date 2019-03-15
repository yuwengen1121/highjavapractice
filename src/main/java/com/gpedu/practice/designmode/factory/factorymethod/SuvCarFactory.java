package com.gpedu.practice.designmode.factory.factorymethod;

import com.gpedu.practice.designmode.factory.ICar;
import com.gpedu.practice.designmode.factory.SuvCar;
import com.gpedu.practice.designmode.factory.factorymethod.ICarFactory;

/**
 * Created by Heavin on 2019/3/12.
 * Des
 */
public class SuvCarFactory extends ICarFactory {
    @Override
    public ICar newInstance() {
        return new SuvCar();
    }
}
