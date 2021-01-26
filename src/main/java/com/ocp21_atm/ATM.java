package com.ocp21_atm;

public class ATM {
    public static void main(String[] args) {
        //帳號(資源)
        Account account = new Account(10_0000);
        //任務(工作)
        Withdraw w1 = new Withdraw(account, 5_0000); // 提五萬
        Withdraw w2 = new Withdraw(account, 3_0000); // 提三萬
        Withdraw w3 = new Withdraw(account, 4_0000); // 提四萬
        //分配任務(工作)
        Thread t1 = new Thread(w1, "小名");
        Thread t2 = new Thread(w2, "小華");
        Thread t3 = new Thread(w3, "小應");
        t1.start();
        t2.start();
        t3.start();
        
    }
}