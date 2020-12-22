package com.ocp13;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class SetDemo3 {
    public static void main(String[] args) {
        //集合與泛型<>
        Set set = new LinkedHashSet();
        while (set.size() < 5){
            set.add(new Random().nextInt(39)+1);
        }
        set.add("雜質");
        System.out.println(set);
        set.remove("雜質"); // remove(過濾) 把資料抓起來後過濾
        System.out.println(set);
        //----------------------------------------------------------------
        System.out.println("--------------------------------------------------");
        Set<Integer> set2 = new LinkedHashSet<>(); // 只能放我規定的元素，稱為泛型
        while (set.size() < 5) {
              set.add(new Random().nextInt(39)+1);
            System.out.println(set2);
            // e -> e.intValue() => Integer e 調用轉成 int
           // set2.stream().mapToInt(e -> e.intValue()).sum(); /Java 5 之前
        int sum = set2.stream().mapToInt(e -> e).sum();
            System.out.println(sum);
        }
    }
    
}
