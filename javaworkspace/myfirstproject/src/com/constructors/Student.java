package com.constructors;

public class Student {
	int sid;
	String sname;

	Student() {
		System.out.println(sid);
		System.out.println(sname);
	}

	Student(int sid, String sname) {
		this.sid = sid;
		this.sname = sname;

	}

	public static void main(String[] args) {
// whenever we don't have a constructor then only the Java compiler will create the default constructor.
		Student s = new Student();
		s.sid = 102;
		s.sname = "Lahari";
		System.out.println(s.sid);
		System.out.println(s.sname);

		Student s1 = new Student(101, "Vennela");
		System.out.println(s1.sid);
		System.out.println(s1.sname);

	}

}
