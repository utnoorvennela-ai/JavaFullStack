package com.oops;

class Person {
	String name;
	int id;

	Person(String name, int id) {
		this.name = name;
		this.id = id;
	}

	void display() {
		System.out.println("Name:" + name);
		System.out.println("Id:" + id);

	}
}

class Students extends Person {
	Students(String name, int id) {
		super(name, id);
	}

	void enrollStudent() {
		System.out.println("Student enrolled successfully");
	}
}

class Teacher extends Person {
	Teacher(String name, int id) {
		super(name, id);
	}

	void assignGrades() {
		System.out.println("Teachers can assign the grades");
	}
}

class Staff extends Person {
	Staff(String name, int id) {
		super(name, id);
	}

	void prepareForWork() {
		System.out.println("Staff can prepare for work");
	}
}

public class School {
	public static void main(String[] args) {
		Students s = new Students("Vennela", 101);
		System.out.println("-----Student Details-----");
		s.display();
		s.enrollStudent();
		System.out.println();
		Teacher t = new Teacher("Lahari", 101);
		System.out.println("-----Teacher Details-----");
		s.display();
		t.assignGrades();
		System.out.println();
		Staff st = new Staff("Rasagna", 101);
		System.out.println("-----Staff Details-----");
		s.display();
		st.prepareForWork();
		System.out.println();

	}
}
