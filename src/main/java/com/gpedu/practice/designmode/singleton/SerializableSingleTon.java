package com.gpedu.practice.designmode.singleton;

import java.io.Serializable;

/**
 * Created by Heavin on 2019/3/15.
 * Des  反序列化的关键是 写一个readResolve()方法 ，返回当前的单例对象
 */

//序列化就是说把内存中的状态通过转换成字节码的形式
//从而转换一个IO流，写入到其他地方(可以是磁盘、网络IO)
//内存中状态给永久保存下来了

//反序列化
//讲已经持久化的字节码内容，转换为IO流
//通过IO流的读取，进而将读取的内容转换为Java对象
//在转换过程中会重新创建对象new

public class SerializableSingleTon implements Serializable {

    private final static SerializableSingleTon ourInstance = new SerializableSingleTon();

    public static SerializableSingleTon getInstance() {
        return ourInstance;
    }

    private SerializableSingleTon() {
    }

     private  Object readResolve(){
         return  ourInstance;
    }
}
