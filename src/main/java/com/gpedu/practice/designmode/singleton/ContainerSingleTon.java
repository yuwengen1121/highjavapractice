package com.gpedu.practice.designmode.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Heavin on 2019/3/15.
 * Des 容器式单例模式
 * <p>
 * Sping 中就是用的这种注册式单例
 */
public class ContainerSingleTon {
    private ContainerSingleTon() {
    }

    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static Object getInstance(String className) {

        synchronized (ioc) {
            if (!ioc.containsKey(className)) {
                Object object = null;
                try {
                    object = Class.forName(className).newInstance();
                    ioc.put(className, object);

                } catch (Exception e) {
                    e.printStackTrace();
                }

                return object;
            }

            return ioc.get(className);
        }
    }
}
