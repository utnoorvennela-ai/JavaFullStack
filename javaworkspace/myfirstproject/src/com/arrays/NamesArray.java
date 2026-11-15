package com.arrays;

//WAP to represent 5 names whose name starts with "S" from 10 names using Arrays..?
public class NamesArray {

	public static void main(String[] args) {

		System.out.println("main method started!!");
		String[] names;
		names = new String[10];

		names[0] = "sachin";
		names[1] = "Sravani";
		names[2] = "Vennela";
		names[3] = "Lahari";
		names[4] = "srivani";
		names[5] = "Pallavi";
		names[6] = "Rasagna";
		names[7] = "Prasanna";
		names[8] = "Abhigna";
		names[9] = "Nandhini";

//		for (int i = 0; i < names.length; i++) {
//			if (names[i].toUpperCase().startsWith("S")) {
//				System.out.println(names[i]);
//
//			}
//		}

		for (String n : names) {
			if (n.toUpperCase().startsWith("S")) {
				System.out.println(n);
			}

		}
	}

}
