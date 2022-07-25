package com.practice;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="Ab$323&&";
		System.out.println("Number is=>"+input.replaceAll("[^0-9]", ""));
	}

}
