package com.ocp9;

public class Overloading {
    //考試-> 呼叫順序(先呼叫資料型別再物件)
     public static void add(Integer x, Integer y ) {
        System.out.println("Integer : " + (x+y));
    }
    public static void add(int x, int y ) {
        System.out.println("int : " + (x+y));
    }
    public static void add(float x, float y ) {
        System.out.println("float : " + (x+y));
    }
    public static void add(double x, double y ) {
        System.out.println("double : " + (x+y));
    }
    // int 的最大值:2147483647(整數太大沒有int先找float) 
    public static void main(String[] args) {
        add(10, 20);
    }
    
}
