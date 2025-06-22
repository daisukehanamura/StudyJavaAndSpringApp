package com.study.generics.practicale;

import java.util.List;
import java.util.function.Function;

public class PracticalExercises {

    PracticalExercises() {

    }

    public void execute(List<Function<String, String>> functions, String input) {
        String result = input;

        for (Function<String, String> function : functions) {
            result = function.apply(result);
        }

        System.out.println("最終結果: " + result);

    }

}
