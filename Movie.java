package com.introduction;

public class Movie {
	
	// Declaration
	String movieName;
	int releasedYear;
	double ticketPrice;

	public static void main(String[] args) {

		Movie movie1 = new Movie();
		movie1.movieName= " Bahubali";
		movie1.releasedYear = 2017;
		movie1.ticketPrice = 280;
		System.out.println("movieName:"+ movie1.movieName);
		System.out.println("releasedYear:"+movie1.releasedYear);
		System.out.println("ticketPrice:"+movie1.ticketPrice);
		System.out.println("**********************************");
		
		Movie movie2 = new Movie();
		movie2.movieName= " devara";
		movie2.releasedYear = 2019;
		movie2.ticketPrice = 260;
		System.out.println("movieName:"+ movie2.movieName);
		System.out.println("releasedYear:"+movie2.releasedYear);
		System.out.println("ticketPrice:"+movie2.ticketPrice);
		System.out.println("*********************************");
		
		Movie movie3= new Movie();
		movie3.movieName= " salaar";
		movie3.releasedYear = 2017;
		movie3.ticketPrice = 290;
		System.out.println("movieName:"+ movie3.movieName);
		System.out.println("releasedYear:"+movie3.releasedYear);
		System.out.println("ticketPrice:"+movie3.ticketPrice);
		System.out.println("***********************************");


	}

	}


