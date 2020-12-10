package com.ocp11.case4_方法內部類別;

public class Bar {
    public void hello() {
        final int x = 100; // 在 java 8 之後就可以不用加final
        
        class Foo {
            void printMe() {
                System.out.println("I am Foo");
                // 若要存取 hello() 外部方法的區域變數
                // 則該變數必須是 final
                System.out.println(x); 
                // x 有給方法內部類別使用,所以它是final, 如果沒有則x就是區域變數
            }
        }
        Foo foo = new Foo();
        foo.printMe();
    }
}
