package com.main.study.generics.practicale.olccoding;

public class Main {

    public static void main(String[] args) {
        PracticalExercises practicalExercises = new PracticalExercises();
        boolean condition = true;
        boolean condition2 = true;

        // ⭐️追加になったらここに引数を追加
        practicalExercises.execute(condition, condition2, "入力値");
    }

}
