package com.study.generics.practicale;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {

    static Function<String, String> functionFirst = t -> "第一にこの加工を" + t + "にする。";

    static Function<String, String> functionSecond = t -> t + "加工したよ";


    public static void main(String[] args) {
        PracticalExercises practicalExercises = new PracticalExercises();
        List<Function<String,String>> functions = new ArrayList<>();
        functions.add(functionFirst);
        functions.add(functionSecond);
        practicalExercises.execute(functions, "入力値");
    }

}
