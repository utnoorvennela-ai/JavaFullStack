package com.arrays;

public class MinAndMax {

	public static void main(String[] args) {

		int[] num = { 5, 2, 7, 9, 1 };
		int max = num[0];
		int min = num[0];
		
		for(int i=0;i<num.length;i++) {
			if(num[i]<min) {
				min=num[i];
			}else if(num[i]>max) {
				max=num[i];
			}
			
		}

//		for (int n : num) {
//			if (n < min) {
//				min = n;// 2
//			} else if (n > max) {
//				max = n;
//			}
//		}
		System.out.println("Maximum value of an array:" + max);
		System.out.println("Minimum value of an array:" + min);
	}

}
