package com.java.practice;

class Client {
	public String firstName;
	public String lastName;
	public int age;
	public String color;
	public int players;

	public String showFullName() {
		return(firstName + "  " + lastName);
	}
}

public class program1 {
	public static void main(String[] args) {
		Client c1=new Client();
		
		c1.firstName="Rishabh";
		c1.lastName="N";
		System.out.println(c1.showFullName());
	}
}
