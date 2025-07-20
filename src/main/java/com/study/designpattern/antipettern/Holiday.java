package com.study.designpattern.antipettern;

public abstract class Holiday {
    private String holidayName;

    public void callHoliday() {
        System.out.println("みんな今日は祝日だよ!");
    }

    abstract public void callHolidayname();

}
