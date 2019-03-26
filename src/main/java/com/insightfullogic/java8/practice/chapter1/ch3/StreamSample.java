package com.insightfullogic.java8.practice.chapter1.ch3;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Character.isDigit;

/**
 * @author dengchao
 * @date 2019/3/25 17:05
 */
public class StreamSample {
    public static void main(String args[]) {

        // map
        System.out.println(Stream.of("a","b","cde").map(String::toUpperCase).collect(Collectors.toList()));
        //filter
        System.out.println(Stream.of("a","b","0e","cde","2d","3d").filter(value -> isDigit(value.charAt(0))).collect(Collectors.toList()));

    }


}
