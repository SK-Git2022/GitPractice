package com.practice;

import java.util.Optional;

public class OptionalClassOperations {

	public static void main(String[] args) {
		
		String[] str=new String[10];
		str[5]="Sachin is the best";
		Optional<String> checkNull=Optional.ofNullable(str[5]);
		
		
		if(checkNull.isPresent()) {
			System.out.println(str[5]);
		} else {
			System.out.println("Value is not present.");
		}
		
		System.out.println(checkNull.filter((s)->s.equals("Sachin is the best")));
		
		
	}

}
