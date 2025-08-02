package com.main.study.holiday;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class holidayConsumer2 {

    public static class TestConsumer {
        static Consumer<String> testConsumer = System.out::println;
        static Consumer<String> testConsumer2 = arg -> System.out.println("Consumer2: " + arg);
        static Consumer<String> testConsumer3 = arg -> System.out.println("Consumer3: " + arg);
    }

    public static void main(String[] args) {
        // 引数に応じたConsumerをMapで管理
        Map<String, Consumer<String>> consumerMap = new HashMap<>();
        consumerMap.put("1", TestConsumer.testConsumer2);
        consumerMap.put("2", TestConsumer.testConsumer3);

        // デフォルトのConsumerを設定
        Consumer<String> selectedConsumer = consumerMap.getOrDefault(args.length > 0 ? args[0] : "", TestConsumer.testConsumer);

        // 実行
        runConsumer(selectedConsumer, args.length > 0 ? args[0] : "Default");
    }

    public static void runConsumer(Consumer<String> consumer, String arg) {
        // コールバック関数を実行
        consumer.accept(arg);

        // 共通処理
        System.out.println("共通処理を実行");
    }
}