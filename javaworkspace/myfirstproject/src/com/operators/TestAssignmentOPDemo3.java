package com.operators;

// Assignment Operators
//= +=,-=,*=,/=,%=
public class TestAssignmentOPDemo3 {

	public static void main(String[] args) {

		int result = 5;

//Type mismatch: cannot convert from double to int
		// result=result+4.5;
		// result = (int) (result + 4.5);
		result += 4.5;
		System.out.println("The result is:" + result);// 9

		// result=result-3.5;//CE
		result -= 3.5;
		System.out.println("THe result is: " + result);// 5 because double can convert to int

		// result=result*4.3;
		result *= 4.3;
		System.out.println("The result is:" + result);// 21

		// result=result/3.5
		result /= 3.5;
		System.out.println("The result is:" + result);// 6

		// result=result%2.5
		result %= 2.5;
		System.out.println("The result is:" + result);

	}

}
