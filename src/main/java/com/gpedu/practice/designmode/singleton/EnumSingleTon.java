package com.gpedu.practice.designmode.singleton;

/**
 * Created by Heavin on 2019/3/15.
 * Des  枚举单例  通常在通用API中使用
 * 放一个Data属性，用来被调用。
 * 枚举单例通过jvm底层处理有效避免了反射攻击和序列化问题
 *
 */
public enum EnumSingleTon {
    INSTANCE;

    public static EnumSingleTon getInstance(){
        return INSTANCE;
    }

    private Object Data;

    public Object getData() {
        return Data;
    }

    public void setData(Object data) {
        Data = data;
    }
}
