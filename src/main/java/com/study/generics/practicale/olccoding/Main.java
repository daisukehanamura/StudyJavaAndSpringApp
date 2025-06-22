package com.study.generics.practicale.olccoding;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        PracticalExercises practicalExercises = new PracticalExercises();
        boolean condition = true;
        boolean condition2 = true;

        // ⭐️追加になったらここに引数を追加
        practicalExercises.execute(condition, condition2, "入力値");
    }

}
