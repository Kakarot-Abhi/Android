package com.imdb.csvparser.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ADBConfig {

    @Value("${user.dir}")
    private String workingDirectory;

    @Value("${adb.relative.path:src/main/resources/static/AndoidTools/platform-tools/adb.exe}")
    private String adbRelativePath;

    public void showData(){
        System.out.println(adbRelativePath + " : " + workingDirectory);
        System.out.println(ADBPATH());
    }

    public String ADBPATH(){
        return workingDirectory.replace("\\", "/")+"/"+adbRelativePath;
    }

}
