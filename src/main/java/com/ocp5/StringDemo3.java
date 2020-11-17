package com.ocp5;

public class StringDemo3 {

    public static void main(String[] args) {
        // 大量使用字串相連使用concat(+)
        String s1 = new String("Java");
        s1 = s1.concat("8");
        System.out.println(s1);
        
        StringBuilder sb = new StringBuilder("Java");
        sb.append("8");
        System.out.println(sb); //sb.toString()
        // 如何比較s1與sb ??
        
        System.out.println(s1.equals(sb.toString()));
        System.out.println(s1.intern() == sb.toString().intern());
        

    }

}
