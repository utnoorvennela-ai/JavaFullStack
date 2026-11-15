package com.arrays;

public class StudentMarks {

	public static void main(String[] args) {

		int[] marks = { 99, 98, 97, 96, 95, 94 };

		int total_marks = 0;
		int avg_marks = 0;
		
		for(int i=0;i<marks.length;i++) {
			total_marks=total_marks+marks[i];
		}

//		for (int m : marks) {
//			total_marks += m;
//		}
		avg_marks = total_marks / marks.length;
		System.out.println("Total Marks:" + total_marks);
		System.out.println("Total Marks:" + avg_marks);

	}

}
