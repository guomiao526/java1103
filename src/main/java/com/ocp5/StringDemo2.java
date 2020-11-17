package com.ocp5;

public class StringDemo2 {

    public static void main(String[] args) {

        String s1 = new String("Java");
        String s2 = "Java";
        s1 = s1.intern(); // 將字串(s1)的內容值放入String pool 內.(節省記憶體)
        s1 = s2; // 強制使s1=s2 的String 字串.
        System.out.println(s1 == s2);
        
        
        
    }

}
