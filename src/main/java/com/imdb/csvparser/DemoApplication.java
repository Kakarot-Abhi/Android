package com.imdb.csvparser;

import com.imdb.csvparser.config.ADBConfig;
import com.imdb.csvparser.process.CmdOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements ApplicationRunner {

	@Autowired
	private CmdOutput cmdOutput;

	@Autowired
	private ADBConfig adbConfig;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		adbConfig.showData();
//		System.out.println(cmdOutput.getListOfDevices());
	}
}

