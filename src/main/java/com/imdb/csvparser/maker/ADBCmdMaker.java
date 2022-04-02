package com.imdb.csvparser.maker;

import com.imdb.csvparser.config.ADBConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.StringJoiner;

@Component
public class ADBCmdMaker {

    @Autowired
    private ADBConfig adbConfig;

    public String getStrCmd(String ...cmds){
        StringJoiner joiner = new StringJoiner(" ");
        joiner.add(adbConfig.ADBPATH());
        Arrays.asList(cmds).stream().forEach(joiner::add);
        return joiner.toString();
    }
}
