package com.constructors;

public class Library {
	String libraryName;
	int totalBooks;

	Library() {
		System.out.println(libraryName);
		System.out.println(totalBooks);

	}

	Library(String libraryName, int totalBooks) {
		this.libraryName = libraryName;
		this.totalBooks = totalBooks;
	}

	public static void main(String[] args) {
		Library l1 = new Library();
		l1.libraryName = "Vcube";
		l1.totalBooks = 500;
		System.out.println(l1.libraryName);
		System.out.println(l1.totalBooks);

		Library l2 = new Library("Java", 400);
		System.out.println(l2.libraryName);
		System.out.println(l2.totalBooks);

	}

}
