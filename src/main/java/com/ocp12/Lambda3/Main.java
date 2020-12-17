package com.ocp12.Lambda3;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        int score =65;
        Pass schoolPass = (x) -> x>=60;
        Pass javaPass = (x) -> x>=70;
        
        checkScore(score, javaPass);
       int foodScore = 1;
        checkScore(foodScore, (x) -> x == 100);
        
        // 使用Predicate
        //boolean tset ( T t)
        Predicate<Double> pass= (x) -> x ==0;
        System.out.println(pass.test(0.18));
        Predicate<Double> bmipass= (x) -> x >= 18 && x < 23;
        System.out.println(bmipass.test(21.76));
        
    }
    
    public static void checkScore(int x , Pass p) {
        System.out.printf("%d 判斷結果 =  %b\n", x , p.check(x));
    }
}
