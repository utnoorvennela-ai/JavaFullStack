package com.oops;

public class TestDemo2 {

	public static void main(String[] args) {
		
		TestDemo1 t3 = new TestDemo1(104,"Abhigna",500000);

		TestDemo1 t1 = new TestDemo1();
		t1.setId(102);
		System.out.println(t1.getId());
		t1.setName("Lahari");
		System.out.println(t1.getName());
		t1.setSal(50000.00);
		System.out.println(t1.getSal());
		System.out.println();

//Accessing the default data within the package
//Whenever the data is private,we cannot access the data outside of the class
		t1.id = 101;
		t1.name = "Vennela";
		t1.sal = 500000.00;
		System.out.println(t1.id);
		System.out.println(t1.name);
		System.out.println(t1.sal);
		System.out.println();

		TestDemo1 t2 = new TestDemo1();
		t2.setId(103);
		System.out.println(t2.getId());
		t2.setName("Rasagna");
		System.out.println(t2.getName());
		t2.setSal(50000.00);
		System.out.println(t2.getSal());

	}

}
