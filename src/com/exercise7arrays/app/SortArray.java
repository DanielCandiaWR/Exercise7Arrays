package com.exercise7arrays.app;
import java.util.Random;
public class SortArray {
	public static void main(String[] args) {
		final byte ARRAY_SIZE = 10;
		byte generatedByteNumber = 0;
		byte auxiliar=0;
		int counter=0;
		byte[] mainArray = new byte[ARRAY_SIZE];
		byte[] bubbleSortArray = new byte[ARRAY_SIZE];
		byte[] insertionSortArray = new byte[ARRAY_SIZE];
		byte[] bucketSortArray = new byte[ARRAY_SIZE];
		
		Random randomNumber = new Random(System.nanoTime());
		for(int i=0;i<ARRAY_SIZE;i++) {
			generatedByteNumber = (byte) randomNumber.nextInt(101);
			mainArray[i] = generatedByteNumber;
			System.out.print(mainArray[i]+" ");
		}
		
		System.out.println("\nBurbble sort");
		bubbleSortArray = mainArray;
		for(int i=0; i<ARRAY_SIZE; i++) {
			for(int j=0; j<ARRAY_SIZE-1 ;j++) {
				if(bubbleSortArray[j] > bubbleSortArray[j+1]) {
					auxiliar = mainArray[j];
					bubbleSortArray[j] = bubbleSortArray[j+1];
					bubbleSortArray[j+1] = auxiliar;
				}
			}
		}
		for(int i=0;i<ARRAY_SIZE;i++) {
			System.out.print(bubbleSortArray[i]+" ");
		}
		
		System.out.println("\nInsert sort");
		insertionSortArray = mainArray;
		for(int i=0; i<ARRAY_SIZE-1; i++) {
			auxiliar = insertionSortArray[i];
			counter = i-1;
			while((counter >= 0) && (auxiliar < mainArray[counter])) {
				insertionSortArray[counter+1] = insertionSortArray[counter];
				counter--;
			}
			insertionSortArray[counter+1] = auxiliar;
		}
		for(int i=0;i<ARRAY_SIZE;i++) {
			System.out.print(insertionSortArray[i]+" ");
		}
		
		System.out.println("\nBucket sort");
		insertionSortArray = mainArray;

	}
}
