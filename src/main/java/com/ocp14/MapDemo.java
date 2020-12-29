package com.ocp14;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();// Linked=有順序的加入進去
        map.put("國文", 100);
        map.put("英文", 90);
        map.put("數學", 100);
        System.out.println(map.get("英文"));
        System.out.println(map.keySet());// 取出所有的key
        System.out.println(map.values());//取出所有的value
        for (String key : map.keySet()) {
            System.out.println(key + "分數:" + map.get(key));
        }
        //Java8
        map.entrySet().forEach(e -> System.out.println(e.getKey() + "=" + e.getValue()));
        //計算總分
        map.entrySet().stream().mapToInt(e -> e.getValue()).sum();
    }
}
