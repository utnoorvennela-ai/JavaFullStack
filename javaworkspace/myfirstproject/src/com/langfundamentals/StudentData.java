package com.langfundamentals;

public class StudentData {
	Integer studentId;
	String studentName;
	String gender;
	String branchName;
	String collegeName;

	void dispStudentDetails() {
		System.out.println("studentId:" + studentId);
		System.out.println("studentName:" + studentName);
		System.out.println("gender:" + gender);
		System.out.println("branchName:" + branchName);
		System.out.println("collegeName:" + collegeName);
		System.out.println("----------------------------");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentData s1 = new StudentData();
		StudentData s2 = new StudentData();

		s1.studentId = 101;
		s1.studentName = "Vennela";
		s1.gender = "Female";
		s1.branchName = "CSE";
		s1.collegeName = "KCEA";

		s2.studentId = 102;
		s2.studentName = "Lahari";
		s2.gender = "Female";
		s2.branchName = "CSE";
		s2.collegeName = "KCEA";

		s1.dispStudentDetails();
		s2.dispStudentDetails();

	}

}
