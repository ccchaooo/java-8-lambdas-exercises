package com.insightfullogic.java8.practice.chapter1.ch2;


/**
 * @author dengchao
 * @date 2019/3/25 17:05
 */
public class NewThread {
    public static void main(String args[]) {

        new Thread(() -> System.out.println("hello world")).start();

    }

}
