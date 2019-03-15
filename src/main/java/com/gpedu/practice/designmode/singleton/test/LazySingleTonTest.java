package com.gpedu.practice.designmode.singleton.test;

import com.gpedu.practice.designmode.singleton.LazySingleTon;

/**
 * Created by Heavin on 2019/3/14.
 * Des
 */
public class LazySingleTonTest {
    public static void main(String[] args) {



        // LazySingleThread lazySingleThread = new LazySingleThread();
        // lazySingleThread.start();
        // LazySingleThread lazySingleThread2 = new LazySingleThread();
        // lazySingleThread2.start();
        // LazySingleThread lazySingleThread3 = new LazySingleThread();
        // lazySingleThread3.start();
        // LazySingleThread lazySingleThread4 = new LazySingleThread();
        // lazySingleThread4.start();
        // LazySingleThread lazySingleThread5 = new LazySingleThread();
        // lazySingleThread5.start();
        // LazySingleThread lazySingleThread6= new LazySingleThread();
        // lazySingleThread6.start();


        Thread thread = new Thread(new LazySingleRunnable());
        Thread thread2 = new Thread(new LazySingleRunnable());
        thread.start();
        thread2.start();


      //  LazySingleTon lazySingleTon1 = LazySingleTon.getInstance();

      //  System.out.println(lazySingleTon1);

    }
}
