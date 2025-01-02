package com.study.aop;

import org.springframework.stereotype.Component;

@Component
public class AopExecute {

    @MyAnnotation1
    public void execute(){
        System.out.print("Execute");
    }
}
