package com.exercise7arrays.app;
import java.util.Random;
public class ArithmetiAverage {
	public static void main(String[] args) {
		final byte ARRAY_SIZE = 100;
		byte [] myArray = new byte[ARRAY_SIZE];
		byte generatedNumberByte = 0;
		int summation = 0;
		double result = 0;
		
		Random randomNumbers = new Random(System.nanoTime());
		for(int i=0;i<ARRAY_SIZE;i++) {
			generatedNumberByte = (byte) randomNumbers.nextInt(101);
			myArray[i] = generatedNumberByte;
		}
		
		for(int i=0;i<ARRAY_SIZE;i++) {
			System.out.print(myArray[i]+",");
			summation += myArray[i];
		}
		result = summation/myArray.length;
		System.out.println("\nThe arithmetic average is: "+result);
	}
}
