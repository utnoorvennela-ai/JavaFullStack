package com.arrays;

import java.util.Scanner;

//1. Write a Java Program to display the repeating numbers uniquely numbers from an array 
public class RepeatingNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of an array:");//5
		int num=sc.nextInt();

		int[] arr=new int[num];//{10,20,30,20,10}
		System.out.println("Enter array elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			int repeated = 0 ;
			int count=0;
			if(arr[i]==repeated) {	
				count++;//1
			}
			System.out.println(repeated);
		}

	}

}
