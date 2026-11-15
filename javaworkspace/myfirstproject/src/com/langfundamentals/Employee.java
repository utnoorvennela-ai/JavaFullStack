package com.langfundamentals;

//Types of variables
public class Employee {

// Primitive+instance
	int emp_id;

//Object+instance
	String emp_name;

//Primitive+static
	static int org_Id = 555;

//Object+static
	static String org_Name = "Vcube";

	public static void main(String[] args) {
		System.out.println("main method started!!");

		int org_id = 666;
		String org_name = "VSS";

		System.out.println(org_id);//
		System.out.println(org_name);//

		System.out.println("-----------------------------------");

		Employee e1 = new Employee();

//Initialization of instance variables
		e1.emp_id = 101;
		e1.emp_name = "Vennela";

//Primitive+local
		int age;
//Object+local
		String city;

// We cannot Access local variables without initialization
		age = 22;
		System.out.println(age);
		city = "Hyderabad";
		System.out.println(city);
		System.out.println("--------------------------------------");

// Accessing static data directly is possible within the class only
		System.out.println("Accessing the Static data directly!!");
		System.out.println(org_id);
		System.out.println(org_name);

//Whenever we want to access static data, outside of the classes then we choose class name.
		System.out.println("Accessing static data by using class name !!");
		System.out.println(Employee.org_Id);
		System.out.println(Employee.org_Name);

//		When we access static data using object reference variable, 
//		we will get Warning from the Compiler : 
//		The static field Employee.org_Id should be accessed in a static way
		System.out.println("Accessing static data by using Object reference variable ");
		System.out.println(e1.org_Id);
		System.out.println(e1.org_Name);

//		But, instance data we can access only through Object Reference variable.
//		Accessing instance data by using Object Reference variables.
		System.out.println(e1.emp_id);
		System.out.println(e1.emp_name);

//		Even though e2 is null, static data is loading 
//		so there is no impact to call static data by using object reference variable. 
//		The Recommended approach to access static data is by using class name only.
		Employee e2 = null;
		System.out.println(e2.org_Id);
		System.out.println(e2.org_Name);

//		System.out.println(e2.emp_id); // NPE
//		System.out.println(e2.emp_name);// NPE

		System.out.println("main method ended ");

	}

}
