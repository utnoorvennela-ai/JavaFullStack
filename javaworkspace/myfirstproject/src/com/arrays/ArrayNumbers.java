package com.arrays;

//WAP to represent the numbers from 0 to 10 using Arrays...?
public class ArrayNumbers {

	public static void main(String[] args) {

		System.out.println("main method started!!");

		// Declaration
		int[] numbers;

		// Creation
		numbers = new int[5];///index starts o to 9

		// Initialization
		numbers[0] = 21;
		numbers[1] = 22;
		numbers[2] = 23;
		numbers[3] = 24;
		numbers[4] = 25;

		// Representation
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);

		}
	}

}
