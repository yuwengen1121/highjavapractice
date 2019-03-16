package com.gpedu.practice.designmode.delegate;

/**
 * Created by Heavin on 2019/3/16.
 * Des
 */
public class EmployeeWeb implements IEmployee {

    @Override
    public void  doing(String cmd){
        System.out.println("我是前端页面开发人员，我开始执行命令："+cmd);
    }

}
