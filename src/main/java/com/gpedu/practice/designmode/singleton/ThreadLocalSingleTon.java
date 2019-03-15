package com.gpedu.practice.designmode.singleton;

/**
 * Created by Heavin on 2019/3/15.
 * Des ThreadLocal 单例， 保证线程内部的全局唯一，并且天生线程安全。
 */
public class ThreadLocalSingleTon {

    private static final ThreadLocal<ThreadLocalSingleTon> ourInstance = new ThreadLocal() {
        @Override
        protected Object initialValue() {
            return new ThreadLocalSingleTon();
        }
    };

    public static ThreadLocalSingleTon getInstance() {
        return ourInstance.get();
    }

    private ThreadLocalSingleTon() {
    }
}
