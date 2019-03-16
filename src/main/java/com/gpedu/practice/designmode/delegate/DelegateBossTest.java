package com.gpedu.practice.designmode.delegate;

/**
 * Created by Heavin on 2019/3/16.
 * Des
 */
public class DelegateBossTest {

    public static void main(String[] args) {
        Boss boss = new Boss();
        Leader leader = new Leader();

        boss.command("java",leader);
        boss.command("web",leader);
        boss.command("ll",leader);

    }




}
