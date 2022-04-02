package com.imdb.csvparser.process;

import static com.imdb.csvparser.constant.ADBCMDCONSTANT.*;

import com.imdb.csvparser.maker.ADBCmdMaker;
import com.imdb.csvparser.model.Device;
import com.imdb.csvparser.model.Devices;
import com.imdb.csvparser.parser.CmdOutputParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CmdOutput {

    /*
    TODO: file manager and make it as work online
     */

    @Autowired
    private RunCommand runCommand;

    @Autowired
    private CmdOutputParser cmdOutputParser;

    @Autowired
    private ADBCmdMaker cmdMaker;

    public List<Device> getListOfDevices() {
        String allDeviceCmd = cmdMaker.getStrCmd(DEVICES);
        String deviceInfo = runCommand.getCommandOutput(allDeviceCmd);
        List<String> connectedDevices = cmdOutputParser.parseDeviceInfo(deviceInfo);
        List<String> connectedDeviceCommand = connectedDevices.stream().map(aDevice -> cmdMaker.getStrCmd("-s", aDevice, SHELL, GETPROP)).collect(Collectors.toList());
        for (String device : connectedDeviceCommand) {
            String output = runCommand.getCommandOutput(device);
            Device model = cmdOutputParser.parseAllProperties(output);
            Devices.add(model);
        }
        return Devices.get();
    }

    public boolean connectDevice(String deviceId) {
        return cmdOutputParser.isDeviceConnected(runCommand.getCommandOutput(CONNECT + deviceId));
    }

    public String rebootDevice(String deviceId) {
        String rebootMsg = runCommand.getCommandOutput(REBOOT);
        return cmdOutputParser.parseRebootOutput(rebootMsg);
    }

    public void installApp(String apkPath) {
        String installMsg = runCommand.getCommandOutput(INSTALL);
        cmdOutputParser.parseInstallMsg(installMsg);
    }

    public void uninstallApp(String apkPath) {
        String uninstallMsg = runCommand.getCommandOutput(UNINSTALL);
        cmdOutputParser.parseUninstallMsg(uninstallMsg);
    }

    public String getDeviceLogs(String deviceId) {
        String logs = runCommand.getCommandOutput(LOGCAT);
        return cmdOutputParser.getDeviceLogs(logs);
    }

    public void startAdbServer() {
        runCommand.getCommandOutput(START_SERVER);
    }

    public void stopAdbServer() {
        runCommand.getCommandOutput(KILL_SERVER);
    }

    public void downloadFile(String path) {
        runCommand.getCommandOutput(PULL);
    }

    public void uploadFile(String fileData) {
        runCommand.getCommandOutput(PUSH);
    }

    public void createBackup(String backupName) {
        runCommand.getCommandOutput(BACKUP + backupName);
    }

    public void restoreBackup(String restoreName) {
        runCommand.getCommandOutput(restoreName);
    }

}
