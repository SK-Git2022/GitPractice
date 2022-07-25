package com.practice;

interface Sayable{  
    void say();  
}

interface Messageable{  
    Message getMessage(String msg);  
} 

class Message{  
    Message(String msg){  
        System.out.print(msg);  
    }  
} 

public class MethodReference {
	
	public static void saySomething() {
		System.out.println("This is static method..");
	}
	
//	public void saySomething() {
//		System.out.println("This is non static method..");
//	}

	public static void main(String[] args) {
		
		//----------------Static Method
//		Sayable sayable=MethodReference::saySomething;
//		sayable.say();

		//----------------Non Static Method
//		Sayable sayable=new MethodReference()::saySomething;
//		sayable.say();
		
		//----------------Constructor Reference
//		Messageable hello = Message::new;  
//	    hello.getMessage("Hello"); 
	}

}
