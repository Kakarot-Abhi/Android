package com.imdb.csvparser.maker;

import com.imdb.csvparser.util.ADBInfoUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.StringJoiner;

@Component
public class ADBCmdMaker {

    @Autowired
    private ADBInfoUtils infoUtils;

    public String getStrCmd(String ...cmds){
        StringJoiner joiner = new StringJoiner(" ");
        joiner.add(infoUtils.ADB());
        Arrays.asList(cmds).stream().forEach(joiner::add);
        return joiner.toString();
    }
}
