package com.oops;


class Animals{
	
	void sounds() {
		System.out.println("Animals can sound differently but not like humans..");
	}
}

class Dogs extends Animals{
	void sounds() {
		System.out.println("Dogs can sound BOW BOW!!");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		Dogs d1=new Dogs();
		d1.sounds();
	}

}
