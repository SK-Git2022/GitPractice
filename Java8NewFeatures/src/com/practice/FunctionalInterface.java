package com.practice;

interface Doable{  
    default void doIt(){  
        System.out.println("Do it now");  
    }   
    
}

interface Sayable1 extends Doable{  
    void say(String msg);   // abstract method  
}

public class FunctionalInterface implements Sayable1{  
	
    public void say(String msg){  
        System.out.println(msg);  
    } 
    
    public static void main(String[] args) {  
    	FunctionalInterface fie = new FunctionalInterface();  
        fie.say("Hello there");  
        fie.doIt();  
    }	
}  
