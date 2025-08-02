package com.main.study.generics.practicale.olccoding;

public class PracticalExercises {

    PracticalExercises() {

    }

    // ⭐️追加になったらここに引数も修正
    public void execute(boolean condition, boolean condition2, String input) {
        String result = input;

        if(condition){
            result = FirstFunction(result);
        }

        if(condition2){
            result = SecondFunction(result);
        }

        // ⭐️追加になったらここに修正を加筆

        System.out.println("最終結果: " + result);

    }

    private String FirstFunction(String input) {
        // 何らかの処理
        return "第一にこの加工を" + input + "にする。";
    }

    private String SecondFunction(String input) {
        // 何らかの処理
        return input+ "加工したよ";
    }

}
