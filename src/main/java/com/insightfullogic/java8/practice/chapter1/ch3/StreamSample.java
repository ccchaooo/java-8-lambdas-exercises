package com.insightfullogic.java8.practice.chapter1.ch3;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.Character.isDigit;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

/**
 * @author dengchao
 * @date 2019/3/25 17:05
 */
public class StreamSample {
    public static void main(String args[]) {

        // map
        System.out.println(Stream.of("a","b","cde").map(String::toUpperCase).collect(toList()));

        //filter
        System.out.println(Stream.of("a","b","0e","cde","2d","3d").filter(value -> isDigit(value.charAt(0))).collect(toList()));

        //多流集合
        List<Integer> list = Stream.of(asList(1, 2),asList(1, 2,3),asList(0,1, 2)).flatMap(Collection::stream).collect(toList());
        System.out.println(list);

        //最小值
        System.out.println(Stream.of("1","22","333","444","555").min(Comparator.comparing(String::length)).get());

        // 求和
        System.out.println(Stream.of(1,2,3,4,5,6,7,8,9).reduce(0,(acc,element) -> acc + element));
    }


}
