package com.constructors;

public class Movie {
	String movieName;
	String directorName;
	double rating;

	Movie() {
		System.out.println("No-arg constructor called");
		movieName = "RRR";
		directorName = "Rajamouli";
		rating = 9.0;

	}

	Movie(String movieName, String directorName, double rating) {
		System.out.println("parameterized constructor called");
		this.movieName = movieName;
		this.directorName = directorName;
		this.rating = rating;

	}

	public static void main(String[] args) {
		System.out.println("Movie Information ");
		Movie m1 = new Movie();
		m1.display();
		Movie m2 = new Movie("Pushpa", "Sukumar", 7.6);
		m2.display();

	}

	void display() {
		System.out.println(movieName);
		System.out.println(directorName);
		System.out.println(rating);
	}

}
