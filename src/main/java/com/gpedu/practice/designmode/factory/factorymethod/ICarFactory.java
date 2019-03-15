package com.gpedu.practice.designmode.factory.factorymethod;

import com.gpedu.practice.designmode.factory.ICar;

/**
 * Created by Heavin on 2019/3/12.
 * Des 汽车工厂
 */
public abstract class ICarFactory {


    public void preNewInstance(){
        System.out.println("这里是共产的，在汽车工厂创建的时候，先给汽车处理一下，比如生成一个机动车编号");
    }

    /**
    * @Author : Heavin
    * @Des :生产
    *
    * @Date :  11:01  2019/3/12
    */
    public abstract ICar newInstance();
}
