package com.oops.copy;

class DeepCopy {
	int id;
	String name;
	double salary;
	Address1 address1;

	public DeepCopy(int id, String name, double salary, Address1 address1) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address1 = address1;
	}

	public DeepCopy(DeepCopy dc) {
		this.id = dc.id;
		this.name = dc.name;
		this.salary = dc.salary;
		this.address1 = new Address1(dc.address1);//Deep Copy
		
	}
}

	class Address1 {
		String city;

		public Address1(String city) {
			super();
			this.city = city;

		}
		public Address1(Address1 address1) {
			this.city=address1.city;
		}

	}

public class TestDeepCopyDemo1 {

	public static void main(String[] args) {
		Address1 add=new Address1("Vijayawada");
		DeepCopy dc1=new DeepCopy(1,"Vennela",50000.00,add);
		
		DeepCopy dc2=new DeepCopy(dc1);
		System.out.println(dc2.id);
		System.out.println(dc2.name);
		System.out.println(dc2.salary);
		System.out.println(dc2.address1.city);
		System.out.println();
		
		dc2.address1.city="Warangal";
		System.out.println(dc2.address1.city);
		System.out.println(dc1.address1.city);




		
	}

}
