package com.ocp18_thread;

public class RunnerMain {
    public static void main(String[] args) {
        Runner r1 = new Runner();
        Runner r2 = new Runner();
        r1.setName("喔規");
        r2.setName("兔子");
        r2.setDaemon(true);//背景執行緒 -> 當別人結束自己也馬上結束 不會跑完
//        r1.setPriority(Thread.MAX_PRIORITY); // 1-10
//        r2.setPriority(Thread.MIN_PRIORITY); // 1-10
        r1.start(); // 啟動執行緒
        r2.start();
    }
    
}
