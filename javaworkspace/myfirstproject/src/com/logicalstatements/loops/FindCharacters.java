package com.logicalstatements.loops;

// WAP to print the characters to the given number
import java.util.Scanner;

//WAP to print the characters based on the given number..
///If the user enters 2, output should be B
public class FindCharacters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		char result = findCharacter(n);
		System.out.println(result);
	}

	static char findCharacter(int n) {
		int count = 0;
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			count = count + 1;
			if (count == n) {
				return ch;

			}

		}
		return 0;
	}
}
