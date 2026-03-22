package com.study.di;

import org.springframework.stereotype.Component;

@Component("java")
public class JavaBook implements Book{

    @Override
    public void read(){
        System.out.print("俺はいまJava本を呼んでいる");
    }
}
