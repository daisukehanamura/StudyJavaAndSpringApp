package com.main.study.generics;

import java.util.function.Predicate;

public class StudyPredicate {

    // 三項演算子を使用
    static Predicate<String> testPredicate = t -> t.equals("Predicate") ? false : true;
    //static Predicate<String> testPredicate = t -> !t.equals("Predicate");

    // 波括弧を使用した場合
    static Predicate<String> testPredicate2 = t -> {
        if (t.equals("Predicate")) {
            return false;
        }
        return true;
    };


    public static void main(String[] args) {
        runPredicate();
    }

    public static void runPredicate() {
        // if(testPredicate.test("Predicate")){System.out.print("OK");}else{System.out.print("NG");}
        System.out.print(testPredicate.test("Predicate") ? "OK" : "NG");

    }
}
