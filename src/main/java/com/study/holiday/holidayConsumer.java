package com.study.holiday;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class holidayConsumer {


    public static class testConsumer {
        static Consumer<String> testConsumer = System.out::println;

        static Consumer<String> testConsumer2 = System.out::println;

        static Consumer<String> testConsumer3 = System.out::println;

        static Consumer<List<String>> testConsumer4 = list -> {
            for (String item : list) {
                System.out.println(item);
                System.out.println("月を跨る処理");

            }
        };

        static Consumer<List<String>> testConsumer5 = list -> list.forEach(System.out::println);

        static Consumer<List<String>> testConsumer6 = list -> {
            for (String item : list) {
                System.out.println(item);
                System.out.println("月を跨らない処理");

            }
        };
    }

    // 呼び出し
    public static void main(String[] args) {
        List<Consumer<String>> consumerLists = new ArrayList<>();
        consumerLists.add(testConsumer.testConsumer);
        String arg = ""; // ここは引数として渡す想定
        if (args[0].equals("1")) {
            consumerLists.add(testConsumer.testConsumer2);
            arg = "1"; // 引数に応じて処理を変える
        } else {
            consumerLists.add(testConsumer.testConsumer3);
            arg = "2"; // 引数に応じて処理を変える
        }
        runConsumer(consumerLists, arg);
    }

    // 呼び出される、関数を受け取るので高階関数
    public static void runConsumer(List<Consumer<String>> testConsumers, String arg) {

        // コールバック関数を実行
        testConsumers.forEach(consumer -> consumer.accept("Sample Input"));

        // あとは共通処理
        System.out.println("共通処理を実行");

    }

}
