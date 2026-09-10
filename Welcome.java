package com.introduction;

public class Welcome{
public static void main(String[] args) throws ClassNotFoundException{
         System.out.println("welcome to java world");
         System.out.println(Class.forName("com.introduction.HelloWorld"));
         System.out.println(Class.forName("java.lang.System"));
         System.out.println(Class.forName("com.mysql.cj.jdbc.Driver"));
         
	}
}