package com.study.helloWorld;

import com.study.di.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloDI {

    private final Book book;

    @Autowired
    public HelloDI(@Qualifier("nba")Book book){
        this.book = book;
    }

    @RequestMapping(value = "/di")
    private String index(){
        book.read();
        return "/index.html";
    }
}
