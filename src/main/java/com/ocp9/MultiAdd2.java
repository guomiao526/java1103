package com.ocp9;

public class MultiAdd2 {
    public static void print(int x, int y  ){
        System.out.println("A");
    }
        public static void print(int... nums){ // ...是最後match的
            System.out.println("B");
    }
    
    public static void main(String[] args) {
        print(1); //印出B
        print(1,2); // A
        print(1,2,3); // B
    }
    
}
