package com.introduction;

public class LibraryBook {
	static String libraryName = "Aadhya Library";
	static String librarianName = "Harika";

	int bookId;
	String bookTitle;
	String authorName;
	int availableCopies;

	static void displayLibraryDetails() {
		System.out.println("libraryName:" + libraryName);
		System.out.println("librarianName:" + librarianName);

	}

	static void changeLibrarian() {

		librarianName = "sahithi";

	}

	void displayBookDetails() {
		System.out.println("librarianName:" + librarianName);
		System.out.println("bookTd:" + bookId);
		System.out.println("bookTitle:" + bookTitle);
		System.out.println("authorName:" + authorName);
		System.out.println("availableCopies:" + availableCopies);

	}

	void issueBook() {
		availableCopies--;

	}

	public static void main(String[] args) {
		LibraryBook b1 = new LibraryBook();
		LibraryBook b2 = new LibraryBook();

		changeLibrarian();
		b1.bookId = 201;
		b1.bookTitle = "JFS";
		b1.authorName = "Srikanth sir";
		b1.availableCopies = 10;

		b1.issueBook();
		b1.displayBookDetails();
		b1.issueBook();

		System.out.println("***************************");

		b2.bookId = 201;
		b2.bookTitle = "MYSQL";
		b2.authorName = "Vishwa sir";
		b2.availableCopies = 10;

		b2.issueBook();
		b2.displayBookDetails();
		b2.issueBook();

	}

}
