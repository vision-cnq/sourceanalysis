package com.kevin.collections.map;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author caonanqing
 * @version 1.0
 * @description     Tree源码分析
 * @createDate 2020/1/9
 */
public class TreeMapSource {

    public static void main(String[] args) {

        // 默认自动排序方式，升序
        // 自定义为倒序
        TreeMap<Integer,Integer> map = new TreeMap<Integer, Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        map.put(1,1);
        map.put(5,5);
        map.put(8,8);
        map.put(3,3);
        map.forEach((k,v) -> System.out.println(k+"-------"+v));

    }
    /**
     *
     *
     */

}
