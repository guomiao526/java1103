package com.ocp19_thread;

public class LuckyNumberPlay {

    public static void main(String[] args) {
        LuckyNumber l1 = new LuckyNumber();
        LuckyNumber l2 = new LuckyNumber();
        l1.setName("小明");
        l2.setName("曉華");

        l1.start();
        l2.start();
    }
}
