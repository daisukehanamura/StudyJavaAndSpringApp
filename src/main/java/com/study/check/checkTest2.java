package com.study.check;

import java.util.ArrayList;
import java.util.List;

public class checkTest2 {

    void checkPattern1(){
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        checkA(list);
        checkB(list);
        checkC(list);
        checkD(list);
    }
    
    void checkA (List<String> list){
        System.out.println("checkA called with list: " + list);
    }
    void checkB (List<String> list){
        System.out.println("checkB called with list: " + list);
    }
    void checkC (List<String> list){
        System.out.println("checkC called with list: " + list);
    }
    void checkD (List<String> list){
        System.out.println("checkD called with list: " + list);
    }

    void checkPattern2(){
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println("checkA called with list: " + list);
        System.out.println("checkB called with list: " + list);
        System.out.println("checkC called with list: " + list);
        System.out.println("checkD called with list: " + list);
    }
}
