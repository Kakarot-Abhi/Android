package com.imdb.csvparser.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Devices {
    private static ArrayList<Device> devices;

    public static void add(Device device){
        if(Objects.isNull(devices)) devices = new ArrayList<>();
        devices.add(device);
    }

    public static List<Device> get(){
        return new ArrayList<>(devices);
    }
}
