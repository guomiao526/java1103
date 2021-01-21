package com.ocp24_executor;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class LottoExecutor implements Executor{

    @Override
    public void execute(Runnable command) {
    Thread t  = new Thread(command);
    t.start();
    }
    
}
