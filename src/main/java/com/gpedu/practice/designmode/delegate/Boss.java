package com.gpedu.practice.designmode.delegate;

/**
 * Created by Heavin on 2019/3/16.
 * Des
 */
public class Boss {

    public void command(String cmd,Leader leader){
        leader.doing(cmd);
    }

}
