package com.imdb.csvparser.process;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@Component
public class RunCommand {

    public String getCommandOutput(String command){
        try {
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader reader=new BufferedReader( new InputStreamReader(process.getInputStream()));
            String s;
            StringBuffer buffer = new StringBuffer();
            while ((s = reader.readLine()) != null){
                buffer.append(s + System.lineSeparator());
                System.out.println("The inout stream is " + s);
            }
            return buffer.toString();
        }
        catch (Exception e){

        }
        return null;
    }
}
