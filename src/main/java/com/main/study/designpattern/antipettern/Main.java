package com.main.study.designpattern.antipettern;

public class Main {
    public static void main(String[] args) {
        Holiday summerHoliday = new SummerHoliday();
        summerHoliday.callHolidayname();

        Holiday winterHoliday = new WinterHoliday();
        winterHoliday.callHolidayname();
    }
}
