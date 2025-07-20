package com.study.designpattern.interfacepattern;

public class Main {
    public static void main(String[] args) {

        HolidayStrategy summerHoliday = new HolidayStrategy(new SummerHoliday());
        summerHoliday.callHolidayname();

        HolidayStrategy winterHoliday = new HolidayStrategy(new WinterHoliday());
        winterHoliday.callHolidayname();

    }
}
