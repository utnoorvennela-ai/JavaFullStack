package com.oops;
//using up-casting
class User {
	String username;
	String password;

	User(String username, String password) {
		this.username = username;
		this.password = password;
	}
}

class Student extends User {
	Student(String username, String password) {
		super(username, password);
	}

	void submitAssignment() {
		System.out.println("Assignment submitted");

	}

}

class Instructors extends User {
	Instructors(String username, String password) {
		super(username, password);
	}

	void createCourse() {
		System.out.println("created course");

	}

}

public class TestOopsDemo1 {
	public static void main(String[] args) {
		Student s1 = new Student("Vennela", "1234");
		Instructors i = new Instructors("Lahari", "4321");
		System.out.println(s1.username);
		System.out.println(s1.password);
		s1.submitAssignment();
		System.out.println();
		System.out.println(i.username);
		System.out.println(i.password);
		i.createCourse();

	}

}
