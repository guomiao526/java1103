package com.ocp12.Lambda2;

@FunctionalInterface // 只能一個自行撰寫的方法
public interface Add {
    int sum(int x , int y);
    public int hashCode(); // 公用方法
    default void copyright(){// default 有實作的方法
        
    }
}
