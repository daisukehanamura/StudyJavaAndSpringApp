package com.study.designpattern.antipettern;

public class WinterHoliday extends Holiday {
    @Override
    public void callHolidayname() {
        this.callHoliday();
        System.out.println("今日は冬休みです。");
        }
}
