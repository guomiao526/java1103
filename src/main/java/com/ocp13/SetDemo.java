package com.ocp13;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

 
public class SetDemo {
    public static void main(String[] args) {
        Set set = new HashSet(); //特性:元素之間的擺放是按照HashCode來決定，提高元素查詢的效率
        set.add("國文");// String
        set.add(100); //不是int 而是Integer
        set.add("英文");
        set.add(Integer.valueOf("100"));// Integer
        set.add("數學"); // String
        set.add(new Integer ("90")); // Integer
        System.out.println(set);
        //for-loop
        for(Object obj : set){
            System.out.println(obj);
        }
    // Java 8 foreach
    set.forEach(e -> System.out.println(e));
    set.forEach(System.out::println);
    // 資料長度(元素個數)
        System.out.println(set.size());
    }
   
}
