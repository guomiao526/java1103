package com.ocp6;

public class ForLoop3 {

    public static void main(String[] args) {
        int[][][]nums = {
            {{100 ,90},{80 , 70}, {60, 50}},
            {{70, 90}, {80,100}, {90, 90}},
            
        };
        // 求所有數字的總和  ?
        // enhanced for loop
        int sum = 0;
        for (int[][] num : nums) {
            for(int[] i :num){
                for(int j:i){
                    System.out.println(j);
                    sum +=j;
                }
                
            
        }
    }
        System.out.printf("sum=%d\n",sum);
    // Standar for loop
        for (int i = 0; i < nums.length; i++) {
            int [][] num = nums[i];
            for(int j = 0;j<num.length;j++){
            int [] nu=num[j];
            for(int k = 0;k<nu.length;k++){
                int n =nu[k];
                System.out.println(n);
                sum+=n;
            }
        }
            
        }
    
    
    }
    
    
    
    
    

}
