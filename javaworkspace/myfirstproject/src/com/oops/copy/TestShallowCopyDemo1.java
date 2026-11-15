package com.oops.copy;

class ShallowCopy implements Cloneable {
	int id;
	String name;
	Address address;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public ShallowCopy(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
}

class Address {
	String city;

	public Address(String city) {
		super();
		this.city = city;
	}

}

public class TestShallowCopyDemo1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address add = new Address("Hyd");
		ShallowCopy s1 = new ShallowCopy(1, "Vennela", add);
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.address.city);
		System.out.println();

		ShallowCopy s2 = (ShallowCopy) s1.clone();
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.address.city);
		System.out.println();

		s2.id = 2;
		s2.name = "Vennela";
		s2.address.city = "Bangalore";
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.address.city);
		System.out.println();

		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.address.city);

	}
}
