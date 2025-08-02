package com.main.study.designpattern.antipettern;

public class SummerHoliday extends Holiday {
    @Override
    public void callHolidayname() {
        this.callHoliday();
        System.out.println("今日は夏休みです。");
    }
}
