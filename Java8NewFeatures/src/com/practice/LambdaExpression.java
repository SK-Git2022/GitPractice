package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpression {

	interface Drawable{  
	    //public void draw();  
	    //public String say(String s1);
		public int addition(int par1, int par2);
	}
	
	static class Product{
		
	    int id;  
	    String name;  
	    float price;  
	    public Product(int id, String name, float price) {  
	        super();  
	        this.id = id;  
	        this.name = name;  
	        this.price = price;  
	    }
		@Override
		public String toString() {
			return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
		}	    
	    
	}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Drawable drawable=()->{
//			System.out.println("Lambda Expresson.");
//		};
//		
//		drawable.draw();
		
//		Drawable drawable1=(name)->{
//			return "Hi "+name;
//		};
//		System.out.println(drawable1.say("Sachin"));
		
//		Drawable drawable=(p1,p2)->(p1+p2);
//		System.out.println(drawable.addition(1, 4));
		
//		List<String> cityNames=new ArrayList<>(Arrays.asList("Pune","Banglore","Chennai"));
//		cityNames.forEach((cityName)->{
//			System.out.println("City =>"+cityName);
//		});
		
//		Runnable runnable=()->{
//			System.out.println("Thread is running.");
//		};
//		Thread thread=new Thread(runnable);
//		thread.start();
		
//---------------------------> Comparator		
//		List<Product> list=new ArrayList<Product>();
//		list.add(new Product(1,"HP Laptop",25000f));  
//	    list.add(new Product(3,"Keyboard",300f));  
//	    list.add(new Product(2,"Dell Mouse",150f));  
//	          
//	    System.out.println("Sorting before the basis of name..."+list); 
//	    
//	    Collections.sort(list, (p1,p2)->{
//	    	return p1.name.compareTo(p2.name);
//	    });
//		
//	    System.out.println("Sorting after the basis of name..."+list); 
//---------------------------> Comparator	    
	    
//-------------------------------Filtering Data
		List<Product> list=new ArrayList<Product>();  
        list.add(new Product(1,"Samsung A5",17000f));  
        list.add(new Product(3,"Iphone 6S",65000f));  
        list.add(new Product(2,"Sony Xperia",25000f));  
        list.add(new Product(4,"Nokia Lumia",15000f));  
        list.add(new Product(5,"Redmi4 ",26000f));  
        list.add(new Product(6,"Lenevo Vibe",19000f));  
        
        Stream<Product> filterdList=list.stream().filter((p1)->p1.price>50000);
        filterdList.forEach((product)->System.out.println(product));
        
        
//-------------------------------Filtering Data
	}

}
