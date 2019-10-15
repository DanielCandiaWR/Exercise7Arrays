package com.exercise7arrays.app;
import java.util.Random;
public class InverseValues {
	public static void main(String[] args) {
		final byte ARRAY_SIZE = 100;
		

		byte generatedByteNumber = 0;
		byte counter=ARRAY_SIZE;
		byte[] myArray = new byte[ARRAY_SIZE];
		byte[] inverseArray = new byte[ARRAY_SIZE];
		
		Random randomNumber = new Random(System.nanoTime());
		for(int i=0;i<ARRAY_SIZE;i++) {
			generatedByteNumber = (byte) randomNumber.nextInt(101);
			myArray[i] = generatedByteNumber;
			System.out.print(myArray[i]+" ");
		}
		System.out.println();
		for(int i=0;i<ARRAY_SIZE;i++) {
			counter--;
			inverseArray[i] = myArray[counter];		
			System.out.print(inverseArray[i]+" ");
		}
	}
}
