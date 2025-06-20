package com.study.generics;

import java.util.function.Supplier;

public class StudySupplier {


    static Supplier<String> testSupplier = () -> {
        return "testSupplier";
    };

    static String getString(){
        return "testSupplier";
    }

    public static void main(String[] args) {
        runSupplier();
        runSupplier2();
    }

    public static void runSupplier() {
        System.out.print(testSupplier.get());
    }

    public static void runSupplier2() {
        System.out.print(getString());
    }
}
