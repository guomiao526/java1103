package com.ocp25_Threadpool;

import java.util.concurrent.TimeUnit;

public class Job implements Runnable {

    @Override
    public void run() {
        System.out.println("一般工作任務-開始");
        try {
            TimeUnit.SECONDS.sleep(3);//相當於Tread.sleep(5000)
        } catch (Exception e) {
        }

        System.out.println("一般工作任務-結束");
    }

}
