package com.main.study.generics.practicale;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {

    static Function<String, String> functionFirst = t -> "第一にこの加工を" + t + "にする。";

    static Function<String, String> functionSecond = t -> t + "加工したよ";


    public static void main(String[] args) {
        PracticalExercises practicalExercises = new PracticalExercises();
        List<Function<String, String>> functions = new ArrayList<>();
        boolean condition = true;
        boolean condition2 = true;

        // 呼び出し元で何をさせるか制御
        if (condition) {
            functions.add(functionFirst);
        }

        // 呼び出し元で何をさせるか制御
        if (condition2) {
            functions.add(functionSecond);
        }

        practicalExercises.execute(functions, "入力値");
    }

}
