package com.gpedu.practice.designmode;

/**
 * Created by Heavin on 2019/3/15.
 * Des
 */
public class ConcurrentExecutorTest {

    public static void main(String[] args) {

        try {
            ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
                @Override
                public void handler() {
                    System.out.println(Thread.currentThread().getName() +":"+System.currentTimeMillis()+ ":"+1+1 );
                }
            },10,5);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
