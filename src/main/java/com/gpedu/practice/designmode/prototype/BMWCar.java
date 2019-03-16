package com.gpedu.practice.designmode.prototype;

import java.io.*;
import java.util.List;

/**
 * Created by Heavin on 2019/3/15.
 * Des
 */
public class BMWCar extends Car implements Cloneable,Serializable {

    private String canFly;

    private List<String> specifys;

    private FM fm;


    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    public Object deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            BMWCar bmwCar = (BMWCar) ois.readObject();
            return bmwCar;


        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }


    public BMWCar shallowClone(BMWCar target) {
        BMWCar bmwCar = new BMWCar();
        bmwCar.canFly = target.canFly;
        bmwCar.specifys = target.specifys;
        bmwCar.fm = target.fm;
        return bmwCar;
    }


    public String getCanFly() {
        return canFly;
    }

    public void setCanFly(String canFly) {
        this.canFly = canFly;
    }

    public List<String> getSpecifys() {
        return specifys;
    }

    public void setSpecifys(List<String> specifys) {
        this.specifys = specifys;
    }

    public FM getFm() {
        return fm;
    }

    public void setFm(FM fm) {
        this.fm = fm;
    }
}
