package com.study.designpattern.interfacepattern;

public class HolidayStrategy {

    private final Holiday holiday;

    HolidayStrategy(Holiday holiday){
        this.holiday = holiday;
    }

    public void callHolidayname() {
        this.holiday.callHoliday();
        this.holiday.callHolidayname();
    }

}
