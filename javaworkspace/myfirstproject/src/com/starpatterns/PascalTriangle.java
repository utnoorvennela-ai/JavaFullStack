package com.starpatterns;

public class PascalTriangle {

	    public static void main(String[] args) {

	        for (int i = 0; i < 5; i++) {

	            // Print spaces
	            for (int j = 0; j < 5 - i; j++) {
	                System.out.print(" ");
	            }

	            int num = 1;

	            // Print Pascal Triangle numbers
	            for (int j = 0; j <= i; j++) {

	                System.out.print(num + " ");

	                num = num * (i - j) / (j + 1);
	            }

	            System.out.println();
	        }
	    }
}
