package com.langfundamentals;

public class DataTypes1 {
	byte b = 127;
	byte b1 = (byte) 130;
	short s = 32767;
	short s1 = (short) 32768;
	int i = 2147483647;
	int i1 = (int) 2147483648l;
	long l = 21474836487l;
	long l1 = 924669545445456787l;
	float f = 5.9f;
	double d = 55.59;
	
	char c = 'A';
	char c1 = 'V';
	char c2 = 65;
	char c3 = 86;

	int i2 = 'p';
	boolean boo = true;

	public static void main(String[] args) {

		DataTypes1 d = new DataTypes1();
		System.out.println(" main method started");
		System.out.println("byte value:" + d.b);
		System.out.println("byte value:" + d.b1);
		System.out.println("short value:" + d.s);
		System.out.println("short value:" + d.s1);

		System.out.println("int value:" + d.i);
		System.out.println("int value:" + d.i1);

		System.out.println("long value:" + d.l);
		System.out.println("long value:" + d.l1);

		System.out.println("float value:" + d.f);
		System.out.println("double value:" + d.d);
		System.out.println("char value:" + d.c);
		System.out.println("char value:" + d.c1);

		System.out.println("char value:" + d.c2);
		System.out.println("char value:" + d.c3);

		System.out.println("int value:" + d.i2);

		System.out.println("boolean value:" + d.boo);

		if (d.boo) {
			System.out.println("helloo !!");
		}

	}

}
