package com.study.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AnnotationUtils {
    @Before("@annotation(MyAnnotation1)")
    public void myAnnotationImpl() {
        System.out.print("Hello AOP");
    }
}