package com.insightfullogic.java8.practice.chapter1.ch2;


/**
 * @author dengchao
 * @date 2019/3/25 17:05
 */
public class MainTest {
    public static void main(String args[]) {

        MainTest mt = new MainTest();
        System.out.println(add.doCal(3,5));
        System.out.println(minus.doCal(3,5));
        System.out.println(multiply.doCal(3,5));
        System.out.println(divide.doCal(6,2));

    }

    static Calculator add      = (x,y) -> x + y;
    static Calculator minus    = (x,y) -> x - y;
    static Calculator multiply = (x,y) -> x * y;
    static Calculator divide   = (x,y) -> x / y;
}
