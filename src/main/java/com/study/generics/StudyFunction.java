package com.study.generics;

import java.util.function.Function;

public class StudyFunction {

    // {}書くならreturn文はいるけど
    // Function<String,String> testFunction = t -> {return t+" ";};
    // {}書かないなら不要。なんなら書いたらコンパイルエラーになる
    // Function<String,String> testFunction = t -> return t+" ";};
    static Function<String, String> testFunction = t -> t + "だお";

    public static void main(String[] args) {
        runFunction();
    }

    public static void runFunction() {
        testFunction.apply("TestFunction");
    }
}
