package com.imdb.csvparser.model;

import com.imdb.csvparser.constant.CustomMethod;
import com.imdb.csvparser.constant.Help;

public class DemoAnnotations {

    @Help(mishra = "ABHISHEK")
    public String demoField;

    @CustomMethod(a=2, b=4)
    public void add(int a, int b){
        System.out.println(a+b);
    }
}
