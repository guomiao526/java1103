package com.ocp14;

// Vector 是執行續安全(多人存取)的集合

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector(81,10); //int initialCapacity, int capacityIncrement// 初始值, 每次超過增加的上限
        for(int i=1;i<=101;i++){
            v.add(i);
        }
        System.out.println("Capacity:" + v.capacity());
        System.out.println("Size: " + v.size());
                
    }
    
}
