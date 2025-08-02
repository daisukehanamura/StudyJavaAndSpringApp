package com.main.study.designpattern.functionpettern;

import java.util.function.Consumer;

public class Holiday {
    private final String holidayName;

    Holiday(String holidayName) {
        this.holidayName = holidayName;
    }

    public void callHoliday(Consumer<String> holidayFunction) {
        holidayFunction.accept(holidayName);
    }

    public void callHolidayname(Consumer<String> holidayNameFunction) {
        holidayNameFunction.accept(holidayName);
    }

}
