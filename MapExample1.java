package com.stream.map;

import java.util.Arrays;
import java.util.List;

public class MapExample1 {
public static void main(String[] args) {
	//add num with 2
	 List<Integer> arrList=Arrays.asList(8,18,28);
	 arrList.stream().map(i -> i+2).forEach(System.out::println);
	
	 //add string with kuruba
	 
	 List<String> strList=Arrays.asList("ravi","arun","anil");
	 strList.stream().map(s -> s+"kumar").forEach(System.out::println);

	 //find even numbers and multiply 10
	 List<Integer> arrNum=Arrays.asList(1,2,3,4,5,6);
	 arrNum.stream().filter(i ->i%2==0)
	 .map(i ->i*10).forEach(System.out::println);

	 ////find even numbers and multiply 10 duplicate remove
	 
	 List<Integer> arrNum1=Arrays.asList(1,2,3,4,4,6,5,6);
	 arrNum.stream().filter(i ->i%2==0)
	 .map(i ->i*10).distinct().forEach(System.out::println);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
}
