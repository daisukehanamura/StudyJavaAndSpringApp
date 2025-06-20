package com.study.generics;

import java.util.function.Consumer;
import java.util.function.Function;

public class StudyConsumer {

    // これは冗長な書き方で
    // static Consumer<String> testConsumer = t -> System.out.print(t);
    // これでいいっぽい
    static Consumer<String> testConsumer = System.out::print;


    public static void main(String[] args) {
        runConsumer();
    }

    public static void runConsumer() {
        testConsumer.accept("TestConsumer");
    }
}
