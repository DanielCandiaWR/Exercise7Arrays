package com.exercise7arrays.app;
import java.util.Random;
public class InverseSum {
	public static void main(String[] args) {
		final byte ARRAY_SIZE = 100;
		
		int[] myArray1 = new int[ARRAY_SIZE];
		int[] myArray2 = new int[ARRAY_SIZE];
		int[] result = new int[ARRAY_SIZE];
		byte generatedByteNumber = 0;
		byte counter = 100;
		
		Random randomNumber = new Random(System.nanoTime());
		for(int i=0; i<ARRAY_SIZE;i++) {
			generatedByteNumber = (byte) randomNumber.nextInt(101);
			myArray1[i] = generatedByteNumber;
			generatedByteNumber = (byte) randomNumber.nextInt(101);
			myArray2[i] = generatedByteNumber;
		}
		for(int i=0;i<ARRAY_SIZE;i++) {
			counter--;
			result[i] = myArray1[i]+myArray2[counter];
			System.out.println("block: "+i+" of Array1: "+myArray1[i]+" + block: "+counter+" of Array2: "+myArray2[counter]+" = "+result[i]);
		}
		
	}
}
