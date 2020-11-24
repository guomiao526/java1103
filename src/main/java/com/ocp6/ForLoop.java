package com.ocp6;

public class ForLoop {

    public static void main(String[] args) {
        int [] scores = {100,90,80};
        for(int i=0;i<scores.length;i++){
            System.out.println(scores[i]);
        }
        // Enhancef(增強) for-loop == 集合\陣列
        // 只能往下讀取 無法改變內容
        // 用來讀取資料分析
        for(int s:scores){
            System.out.println(s);
        }
    }

}
