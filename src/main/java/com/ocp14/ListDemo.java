package com.ocp14;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> scores = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            scores.add(new Random().nextInt(11)); // 0-10
            
        }
        System.out.println(scores);
        // 排序
        Collections.sort(scores);
        System.out.println(scores);
        //去掉最前面元素
        scores.remove(0); // 去掉位置 0 的元素
        scores.remove(0); // 再去掉位置 0 的元素
        System.out.println(scores);
        // 去掉最後 2 個的元素
        scores.remove(scores.size()-1); // 去掉最後一個的元素
        scores.remove(scores.size()-1); // 再去掉最後一個的元素
        System.out.println(scores);
        //利用java 8 stream 來求得平均
        double avg = scores.stream()
                 .mapToInt(score -> score) //score -> score.intValue()
                 .average()
                 .getAsDouble();
         System.out.println("平均 : " + avg);
    }
    
}
