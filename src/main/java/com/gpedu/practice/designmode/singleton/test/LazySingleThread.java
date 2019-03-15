package com.gpedu.practice.designmode.singleton.test;

import com.gpedu.practice.designmode.singleton.LazySingleTon;

/**
 * Created by Heavin on 2019/3/14.
 * Des
 */
public class LazySingleThread extends Thread {

    @Override
    public void run() {
        LazySingleTon instance = LazySingleTon.getInstance();
        System.out.println(Thread.currentThread().getName() +"-------"+ instance);
    }
}
