package com.ocp12.Lambda3;

public class Main {
    public static void main(String[] args) {
        int score =65;
        Pass schoolPass = (x) -> x>=60;
        Pass javaPass = (x) -> x>=70;
        
        checkScore(score, javaPass);
       int foodScore = 1;
        checkScore(foodScore, (x) -> x == 100);
    
    }
    
    public static void checkScore(int x , Pass p) {
        System.out.printf("%d 判斷結果 =  %b\n", x , p.check(x));
    }
}
