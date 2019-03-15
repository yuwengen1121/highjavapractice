package com.gpedu.practice.designmode.singleton.test;

import com.gpedu.practice.designmode.singleton.HungrySingleTon;

/**
 * Created by Heavin on 2019/3/14.
 * Des
 */
public class HungrySingleTonTest {
    public static void main(String[] args) {
        HungrySingleTon hungrySingleTon = HungrySingleTon.getInstance();
        HungrySingleTon hungrySingleTon2 = HungrySingleTon.getInstance();
        HungrySingleTon hungrySingleTon3 = HungrySingleTon.getInstance();
        System.out.println(hungrySingleTon);
        System.out.println(hungrySingleTon2);
        System.out.println(hungrySingleTon3);
    }
}
