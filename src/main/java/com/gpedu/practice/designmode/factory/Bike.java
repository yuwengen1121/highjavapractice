package com.gpedu.practice.designmode.factory;

/**
 * Created by Heavin on 2019/3/12.
 * Des
 */
public class Bike implements ICar {

    private String name;

    public Bike() {
        System.out.println("单车构造方法");
    }

    @Override
    public void drive() {
        System.out.println("笑嘻嘻的骑单车");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "name='" + name + '\'' +
                '}';
    }
}
