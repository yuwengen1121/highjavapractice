package com.gpedu.practice.designmode.delegate;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Heavin on 2019/3/16.
 * Des  leader 收到老板命令，委派下面的工程师做事。
 *
 */
public class Leader {

    private Map<String,IEmployee> registerMap = new LinkedHashMap<>();

    public Leader() {
        registerMap.put("java",new EmployeeJava());
        registerMap.put("web",new EmployeeWeb());
    }

    //接受命令，委派工程师干活

    public void doing(String cmd){
        IEmployee iEmployee = registerMap.get(cmd);
        if(null != iEmployee ){
            iEmployee.doing(cmd);
        }else {
            System.out.println("Leader说，这条命令暂时没有人会处理");
        }
    }

}
