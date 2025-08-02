package com.main.study.designpattern.interfacepattern;

public class SummerHoliday implements Holiday {

    @Override
    public void callHoliday() {
        System.out.println("みんな今日は祝日だよ!");
    }

    @Override
    public void callHolidayname() {
        System.out.println("今日は夏休みです。");
    }

}
