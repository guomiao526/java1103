package com.ocp13;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        Set set = new LinkedHashSet(); //HashSet(); => 不按照順序隨機拿出
        //LinkedHashSet 放進去的順序等於=拿出來的順序
        //TreeSet 將數字由小到大排序出來
        //今彩539 1-39 中取5個不重複的數字
        // 電腦選號
        set.add(1);
        System.out.println(set.size());
        while (set.size() < 5) { 
            // 產生一個1-39的隨機數
            int n = new Random().nextInt(39)+1;
            set.add(n);
            System.out.println("加入 ==>" + n);
        }
        System.out.println(set);
        //彩球的號碼總和 ?
        // Java 7 for-loop
        int sum = 0;
        for(Object obj : set){
            if(obj instanceof Integer){
                sum+=(Integer)obj;
            }
        }
        System.out.println(sum);
        // Java 8
        int sum2 = set.stream().mapToInt(e -> ((Integer)e).intValue()).sum();
        int sum3 = set.stream().mapToInt(e -> (Integer)e).sum();
        System.out.println(sum2);
        System.out.println(sum3);
    }
    
}
