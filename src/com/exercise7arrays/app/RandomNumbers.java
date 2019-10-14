package com.exercise7arrays.app;
import java.util.Random;
public class RandomNumbers {
	public static void main(String[] args) {
		//Constant declaration
		final int ELEMENTS_ARRAY = 100;
		//Variables declaration
		double generatedNumber = 0;
		int generatedNumberInt = 0;
		byte generatedNumberByte = 0;
		byte evenValues = 0;
		byte zeroValues = 0;
		byte oddValues = 0;
		byte positiveValues = 0;
		byte negativeValues = 0;
		
		//Arrays declaration
		byte[] myArray1 = new byte[ELEMENTS_ARRAY];
		//Array pseudo random numbers
		//Way 1 by means of Random Class
		Random randomNumbers = new Random(System.nanoTime());
		System.out.println("Generated pseudo random double numbers: ");
		for(int i=0;i<ELEMENTS_ARRAY;i++) {
			generatedNumber = randomNumbers.nextDouble();
			System.out.println(generatedNumber+" ");
		}
		System.out.print("\nGenerated pseudo random int numbers: ");
		for(int i=0;i<ELEMENTS_ARRAY;i++) {
			generatedNumberInt = randomNumbers.nextInt(51)+50;
			System.out.println(generatedNumberInt+" ");
		}
			
		//Way 2 by means of Math Class
		System.out.print("\nGenerated pseudo random numbers with Math class: ");
		for(int i=0;i<ELEMENTS_ARRAY;i++) {
			generatedNumberInt = (int) (Math.random()*50+50);
			//generatedNumberInt = (int) generatedNumber;
			System.out.println(generatedNumberInt+" ");
		}
		
		//Pass 1 Initialize
		System.out.println("\nFill a vector with Random class: ");
		for(int i=0;i<ELEMENTS_ARRAY;i++) {
			generatedNumberByte = (byte) randomNumbers.nextInt(101);
			myArray1[i] = generatedNumberByte; 
			System.out.println(myArray1[i]+" ");
		}
		
		//Pass 2 Process
		for (int i=0;i<ELEMENTS_ARRAY;i++) {
			if(myArray1[i]==0) {
				zeroValues++;
			}else if(myArray1[i]%2==0) {
				evenValues++;
			}else if(myArray1[i]%2==1) {
				oddValues++;
			}else if(myArray1[i]>0) {
				positiveValues++;
			}else if(myArray1[i]<0) {
				negativeValues++;
			}
		}
		
		//Pass 3 Visualization
		System.out.println("Zeros quantity: "+zeroValues);
		System.out.println("Odd Values: "+oddValues);
		System.out.println("Even Values: "+evenValues);
		System.out.println("Positive Values: "+positiveValues);
		System.out.println("Negative Values: "+negativeValues);
	}
}
