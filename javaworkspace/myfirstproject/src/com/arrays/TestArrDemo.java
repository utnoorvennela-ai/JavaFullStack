package com.arrays;

public class TestArrDemo {

	public static void main(String[] args) {

		/// Type mismatch: cannot convert from float to int
//      float[] num=new float[3.2f];
		/// Type mismatch: cannot convert from double to int
//		double[] number=new double[6.8];
		char[] numbers;
		numbers = new char[10];
		numbers[0] = 'A';
		numbers[1] = 'B';
		numbers[2] = 'C';
		numbers[3] = 'd';

//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println((int)numbers[i]);
//
//		}

		for (int n : numbers) {
			System.out.println(n);
		}
	}

}
