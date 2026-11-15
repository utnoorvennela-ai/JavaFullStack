package com.oops;


//Single Inheritance:by using child object child reference ,
//we can call both parent and child functionalities using extends only.
class Animal {

	void sound() {
		System.out.println("Animals can sound differently");
	}
}

class Dog extends Animal {

}

public class SingleInhDemo1 {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
		
	}

}
