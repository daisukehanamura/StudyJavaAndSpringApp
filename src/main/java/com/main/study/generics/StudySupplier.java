package com.main.study.generics;

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
        runSupplier2(testSupplier);
    }

    public static void runSupplier() {
        System.out.println(testSupplier.get());
    }

    public static void runSupplier2(Supplier<String> testSupplierParam) {
        System.out.println(testSupplierParam.get());
    }
}
