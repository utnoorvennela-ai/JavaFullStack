package com.arrays;

//WAP to represent the even numbers from 0 to 10 using Arrays..?
public class EvenNumbers {

	public static void main(String[] args) {

//The literal 10000000000 of type int is out of range
//      int legth-->2147483647
///		int[] n = new int[2147483647];  /// out of memory error
///		int[] n = new int[-5];  // RE:NegativeArraySizeException
///     int[] n = new int[0]; //ArrayIndexOutOfBoundsException
		int[] numbers;// D
		numbers = new int[10];// C

		numbers[0] = 101;
		numbers[1] = 102;
		numbers[2] = 103;
		numbers[3] = 104;
		numbers[4] = 105;
		numbers[5] = 106;
		numbers[6] = 107;

		// Using for loop
//
//		for (int i = 0; i < numbers.length; i++) {
//			if (numbers[i] % 2 == 0 && numbers[i] != 0) {  
//				System.out.println(numbers[i]);
//			}
//
//		}

		// using for-each loop
		for (int n : numbers) {
			if (n % 2 == 0 && n != 0) {
				System.out.println(n);

			}

		}
	}

}
