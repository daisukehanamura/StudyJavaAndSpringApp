package com.study.designpattern.functionpettern;

import java.util.function.Consumer;

public class Main {

    private static final Consumer<String> holidayFunction = holidayName -> {
        System.out.println("今日は" + holidayName + "です。");
    };

    public static void main(String[] args) {

        Holiday summerHoliday = new Holiday("夏休み");
        summerHoliday.callHoliday(holidayFunction);

        Holiday winterHoliday = new Holiday("冬休み");
        winterHoliday.callHoliday(holidayFunction);



    }
}
