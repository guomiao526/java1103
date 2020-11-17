package com.ocp5;

import java.util.Arrays;

public class NultiArray {

    public static void main(String[] args) {
        int[][] score = new int[2][3];
        System.out.println(score.length);
        System.out.println(score[0].length);
        System.out.println(score[1].length);
        System.out.println(Arrays.toString(score[0]));
        System.out.println(Arrays.toString(score[1]));
        for(int i=0;i<score.length;i++){
            System.out.println(Arrays.toString(score[i]));
        }

    }

}
