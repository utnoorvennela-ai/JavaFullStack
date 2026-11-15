package com.langfundamentals;

// No return type + No parameters: instance & static methods
public class TypesOfMethodsDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		TypesOfMethodsDemo1 t1 = new TypesOfMethodsDemo1();
// static method Accessing directly
		welcome();
// static method Accessing by using class name
		TypesOfMethodsDemo1.welcome();
//We can Accessing the static method using object reference variable
		t1.welcome();
//We can Accessing the instance method using object reference variable
		t1.display();
	}

//   Instance Method
	void display() {
		System.out.println("Good Morning!!");
	}

// Static Method
	static void welcome() {
		System.out.println("welcome to Vcube-Java");

	}

}
