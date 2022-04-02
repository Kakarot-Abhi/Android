package com.imdb.csvparser;

import com.imdb.csvparser.process.CmdOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

@SpringBootApplication
public class DemoApplication implements ApplicationRunner {

	@Autowired
	private CmdOutput cmdOutput;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {

//		System.out.println(DemoApplication.find(Arrays.asList(6, -2, 5)));
		System.out.println(DemoApplication.find(Arrays.asList(-6, -7, -8, 1, -6)));
//		-5
//		System.out.println(DemoApplication.find(Arrays.asList(-1,2,3)));

//		System.out.println(DemoApplication.findEarliest(Arrays.asList(1,3,2,3)));
//		System.out.println(DemoApplication.findEarliest(Arrays.asList(1,3,2,4,5)));

//		try {
//			BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\abhmishr16\\Desktop\\temp.txt"));
//			String line = bufferedReader.readLine();
////			boolean b = Pattern.compile("^((ab)|(ba))*$").matcher(line).find();
//			boolean b = Pattern.compile("^(?:(?:ab)|(?:ba))*$").matcher(line).find();
//			System.out.println(b);
//		}
//		catch (Exception e){
//			e.printStackTrace();
//		}

//		CustomDesirealizer desirealizer = new CustomDesirealizer();
//		DemoAnnotations demo = desirealizer.annotationDemo(DemoAnnotations.class);
//		System.out.println(demo.demoField);
		System.out.println(cmdOutput.getListOfDevices());
	}

//	[1,3,2,3]  ans = 2
//	[1,3,2,4,5]  ans = 2
//	[-1,2,3] ans = 5
//	[6, -2, 5]  ans = 9

	public static int find(List<Integer> tempChange){
		int maximum = Integer.MIN_VALUE;
		for (int dayIndex = 0; dayIndex < tempChange.size(); dayIndex++) {
			int left = getStartSum(tempChange, dayIndex+1);
			int right = getEndSum(tempChange, dayIndex);
			int max = Math.max(left, right);
			maximum = Math.max(max, maximum);
			System.out.println("left : " + left + " : right " + right + " : max "  + max + " : " + maximum);
		}
		return maximum;
	}

	public static int getStartSum(List<Integer> stockPrice, int start){
		return stockPrice.stream().limit(start).mapToInt(Integer::valueOf).sum();//double;//.getAsDouble();
	}

	public static int getEndSum(List<Integer> stockPrice, int end){
		return stockPrice.stream().skip(end).mapToInt(Integer::valueOf).sum();
	}



	public static int findEarliest(List<Integer> stockPrice){
		int smallestVal = Integer.MAX_VALUE;
		int smallestIndex = -1;
		for (int monthIndex = 0; monthIndex < stockPrice.size() - 1; monthIndex++) {
			int left = getStartAvg(stockPrice, monthIndex+1);
			int right = getEndAvg(stockPrice, monthIndex+1);
			int abs = Math.abs((left - right));
			System.out.println("left : " + left + " : right " + right + " : abs "  + abs);
			if(abs < smallestVal){
				smallestVal = abs;
				smallestIndex = monthIndex + 1;
			}
		}
		return smallestIndex;
	}

	public static int getStartAvg(List<Integer> stockPrice, int start){

		start = start -1;
		int sum = 0;
		for (int startIndex = 0; startIndex < (start -1); startIndex++) {
			sum +=stockPrice.get(startIndex);
		}

		return (int) Math.floor((sum/(start+1)));

//		double asDouble = stockPrice.stream().limit(start).mapToInt(Integer::valueOf).average().getAsDouble();
//		double floor = Math.floor(asDouble);
//		return (int) floor;
	}

	public static int getEndAvg(List<Integer> stockPrice, int end){
		double asDouble = stockPrice.stream().skip(end).mapToInt(Integer::valueOf).average().getAsDouble();
		double floor = Math.floor(asDouble);
		return (int)floor;
	}
}

