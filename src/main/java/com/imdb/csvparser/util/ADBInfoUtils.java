package com.imdb.csvparser.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ADBInfoUtils {

    @Value("${com.adb.path}")
    private String adb;

    public String ADB(){
        return adb;
    }

}
