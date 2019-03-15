package com.gpedu.practice.designmode.factory.abstractfactory;

import com.gpedu.practice.designmode.factory.ElderPeppleMobile;
import com.gpedu.practice.designmode.factory.ICar;
import com.gpedu.practice.designmode.factory.IMobile;
import com.gpedu.practice.designmode.factory.SmallCar;

/**
 * Created by Heavin on 2019/3/12.
 * Des
 */
public class OldCarFactory implements IAbstractFactory{
    @Override
    public ICar instanceCar() {
        return new SmallCar();
    }

    @Override
    public IMobile instanceMobile() {
        return new ElderPeppleMobile();
    }
}
