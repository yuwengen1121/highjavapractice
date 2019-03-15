package com.gpedu.practice.designmode.singleton.test;

/**
 * Created by Heavin on 2019/3/15.
 * Des 通过利用内部类的加载机制。默认使用LazyInnerClassSingleTon的时候，会先初始化内部类，如果没使用的话，内部类是不加载的
 *
 * 这种形式兼顾饿汉式的内存浪费，也兼顾synchronized性能问题
 * 完美地屏蔽了这两个缺点
 * 史上最牛B的单例模式的实现方式
 */

public class LazyInnerClassSingleTon {

    private LazyInnerClassSingleTon() {
        if (lazyHolder.LAZT != null) {
            throw new RuntimeException("实例已存在，不容许创建多个实例");
        }
    }

    public static final LazyInnerClassSingleTon getInstance() {
        return lazyHolder.LAZT;
    }

    private static class lazyHolder {
        private static final LazyInnerClassSingleTon LAZT = new LazyInnerClassSingleTon();
    }

}
