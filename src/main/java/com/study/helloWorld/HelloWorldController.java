package com.study.helloWorld;

import com.study.aop.AopExecute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    private final AopExecute aopExecute;

    @Autowired
    public HelloWorldController(AopExecute aopExecute){
        this.aopExecute = aopExecute;
    }

    @RequestMapping(value="/hello")
    private String HelloWorld(){
        aopExecute.execute();
        return "/index.html";
    }
}
