package com.gpedu.practice.designmode.prototype.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gpedu.practice.designmode.prototype.BMWCar;
import com.gpedu.practice.designmode.prototype.FM;
import org.springframework.beans.BeanUtils;

/**
 * Created by Heavin on 2019/3/15.
 * Des 测试证明， BeanUtils.copyProperties  是浅克隆  引用类型的属性，只是复制了对象的引用。
 */
public class BeanUtilTest {

    public static void main(String[] args) {
        BMWCar bmwCar = new BMWCar();
        bmwCar.setName("国产宝马");
        bmwCar.setCreateTime(new Date());
        bmwCar.setCanFly("可以飞");
        List list = new ArrayList();
        list.add("好看");
        list.add("动力强劲");
        bmwCar.setSpecifys(list);

        FM fm = new FM();
        fm.setFmName("厉害的fm收音机");
        bmwCar.setFm(fm);


        BMWCar copyCar = new BMWCar();

        BeanUtils.copyProperties(bmwCar,copyCar);

        System.out.println("copyCar"+copyCar);
        System.out.println("bmwCar"+bmwCar);

        System.out.println(bmwCar.getSpecifys()  +":"+ bmwCar.getCanFly()  +":"+ bmwCar.getFm().getFmName());
        System.out.println(copyCar.getSpecifys()  +":"+ copyCar.getCanFly()  +":"+copyCar.getFm().getFmName());

        System.out.println(bmwCar.getSpecifys() == copyCar.getSpecifys());

        List<String> specifys = copyCar.getSpecifys();
        specifys.add("新加一个新的特点");
        copyCar.setSpecifys(specifys);
        copyCar.setCanFly("改了可以飞");
        copyCar.getFm().setFmName("改了收音机名字");

        System.out.println(bmwCar.getSpecifys() +":"+ bmwCar.getCanFly()  +":"+ bmwCar.getFm().getFmName() );
        System.out.println(copyCar.getSpecifys()  +":"+copyCar.getCanFly()  +":"+copyCar.getFm().getFmName() );

    }
}
