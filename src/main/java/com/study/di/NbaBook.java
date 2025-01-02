package com.study.di;

import org.springframework.stereotype.Component;

@Component("nba")
public class NbaBook implements Book{
    @Override
    public void read(){
        System.out.print("俺は今NBA本を呼んでいる");
    }
}
