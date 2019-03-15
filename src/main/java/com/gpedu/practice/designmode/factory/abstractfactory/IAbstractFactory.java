package com.gpedu.practice.designmode.factory.abstractfactory;

import com.gpedu.practice.designmode.factory.ICar;
import com.gpedu.practice.designmode.factory.IMobile;

/**
 * Created by Heavin on 2019/3/12.
 * Des 抽象工厂，有汽车和电话 两个产品  ，
 * 产品族（汽车，电话），
 * 产品结构 汽车-单车、轿车、suv   电话-老人机、智能电话
 */
public interface IAbstractFactory {

    ICar instanceCar();

    IMobile instanceMobile();

}
