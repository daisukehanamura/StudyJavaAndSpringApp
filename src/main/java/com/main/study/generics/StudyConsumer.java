package com.main.study.generics;

import java.util.function.Consumer;

public class StudyConsumer {

    // これは冗長な書き方で
    // static Consumer<String> testConsumer = t -> System.out.print(t);
    // これでいいっぽい
    static Consumer<String> testConsumer = System.out::println;

    static void printString(){
        System.out.println("printString");
    }

    public static void main(String[] args) {
        runConsumer();
        runConsumer2();
    }

    public static void runConsumer() {
        testConsumer.accept("TestConsumer");
    }

    public static void runConsumer2() {
        printString();
    }
}
