package com.imdb.csvparser.parser;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.imdb.csvparser.model.Device;
import com.imdb.csvparser.util.LambdaUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
public class CmdOutputParser {

    @Autowired
    private LambdaUtils lambdaUtils;

    @Value("frame")
    String name;

    public List<String> parseDeviceInfo(String deviceInfo) {
        List<String> deviceInfoArrays = Arrays.stream(deviceInfo.split(System.lineSeparator())).skip(1).collect(Collectors.toList());
        List<String> connectedDevices = new ArrayList<>();

        return deviceInfoArrays.stream().map(aDevice -> aDevice.split("\\s+")[0]).collect(Collectors.toList());

//        for (String aDevice :
//             deviceInfoArrays) {
//            String[] perDevice = aDevice.split("\\s+");
//            connectedDevices.perDevice[0]
//            System.out.println(Arrays.toString(perDevice));
//        }

//        return null;//Arrays.asList(new Device(deviceInfo, null, null));
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

//            Enumeration<?> propertyNames = properties.propertyNames();
//            while (propertyNames.hasMoreElements()){
//                String key = (String) propertyNames.nextElement();
//                String value = (String) properties.get(key);
//                hashMap.put(lambdaUtils.trimPrefSuffix.apply(key), lambdaUtils.trimPrefSuffix.apply(value));
//            }
            ObjectMapper mapper = new ObjectMapper();
//            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);;



            Device device = mapper.convertValue(hashMap, Device.class);
            return device;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Device.builder().build();
    }
}
