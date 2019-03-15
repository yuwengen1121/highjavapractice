package com.gpedu.practice.designmode.singleton;

/**
 * Created by Heavin on 2019/3/14.
 * Des 懒汉式单例模式
 * 双层检查 DCL double check lock
 * 实现关键 1 、关键字 volatile   2、synchronized  两个非空判断，是为了减少不必要的锁，增加效率。
 *
 *
 */
public class LazySingleTon {

    private  volatile static LazySingleTon ourInstance = null;

    //public static synchronized LazySingleTon getInstance() {
    // 不加 synchronized 会造成线程不安全
    //这种写法，锁在初始化方法，多线程的时候效率不高，继续优化，采取双层检查 doubleCheck

    public static LazySingleTon getInstance() {
        if (null == ourInstance) {
            synchronized (LazySingleTon.class) {
                if (null == ourInstance) {
                    ourInstance = new LazySingleTon();
                }
            }

        }

        return ourInstance;
    }

    private LazySingleTon() {
    }

}
