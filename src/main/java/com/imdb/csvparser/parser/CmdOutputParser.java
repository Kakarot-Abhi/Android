package com.imdb.csvparser.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.imdb.csvparser.model.Device;
import com.imdb.csvparser.util.LambdaUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.StringReader;
import java.util.*;
import java.util.stream.Collectors;

@Component
public class CmdOutputParser {

    @Autowired
    private LambdaUtils lambdaUtils;

    public List<String> parseDeviceInfo(String deviceInfo) {
        List<String> deviceInfoArrays = Arrays.stream(deviceInfo.split(System.lineSeparator())).skip(1).collect(Collectors.toList());
        List<String> connectedDevices = new ArrayList<>();

        return deviceInfoArrays.stream().map(aDevice -> aDevice.split("\\s+")[0]).collect(Collectors.toList());
    }

    public boolean isDeviceConnected(String commandOutput) {
        return false;
    }

    public String parseRebootOutput(String rebootMsg) {
        return rebootMsg;
    }

    public void parseInstallMsg(String installMsg) {
    }

    public void parseUninstallMsg(String uninstallMsg) {
    }

    public String getDeviceLogs(String logs) {
        return logs;
    }

    public Device parseAllProperties(String output) {
        output = output.replace(": ", "=");
        Properties properties = new Properties();
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            properties.load(new StringReader(output));
            properties.forEach((k, v) -> hashMap.put(lambdaUtils.trimPrefSuffix.apply((String) k), lambdaUtils.trimPrefSuffix.apply((String) v)));
            ObjectMapper mapper = new ObjectMapper();  //TODO: Make ObjectMapper a bean
            Device device = mapper.convertValue(hashMap, Device.class);
            return device;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
