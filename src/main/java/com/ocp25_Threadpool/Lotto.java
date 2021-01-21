package com.ocp25_Threadpool;

import java.util.Random;
import java.util.concurrent.Callable;

public class Lotto implements Runnable{
//Callable 有回傳值的執行緒
    @Override
    public void run(){
        try {Thread.sleep(1);
            
        } catch (Exception e) {
        }
        System.out.println(new Random().nextInt(100)); 
    }
    
}
