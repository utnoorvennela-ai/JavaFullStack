package com.arrays;

import java.util.Arrays;

//write a Java program to print the sum of next and previous elements into current index using temporary array
//and handle the edge cases
public class SumOfPreviousNext {

	public static void main(String[] args) {
		int[] arr= {2,3,4,5};
		int [] temp=new int[arr.length];//4
		for(int i=0;i<arr.length;i++) {  //0<4
			if(i==0) {
				temp[i]=arr[i+1];//3
			}
			else if(i==arr.length-1) {// i=3
				temp[i]=arr[i-1];//4
			}
			else {
				temp[i]=arr[i-1]+arr[i+1];
			}
			
		}
		System.out.println(Arrays.toString(temp));
	}

}
