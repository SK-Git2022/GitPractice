package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product{
	
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

public class StreamOperations {

	public static void main(String[] args) {
		
//		Stream.iterate(1,(element)->element+1)
//		.filter((element)->element%5==0)
//		.limit(5)
//		.forEach(System.out::println);
		
		List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));
//        
//        List<Float> filteredProductsList = productsList.stream()
//        .filter((product)->product.price>60000)
//        .map((product)->product.price)
//        .collect(Collectors.toList());
//        
//        filteredProductsList.forEach((price)->System.out.println(price));
		
//        Double totalPrice=productsList.stream().collect(Collectors.summingDouble((product)->product.price));
//        System.out.println("Total price is=>"+totalPrice);
        
//		  Converting Product List To Map
        Map<Integer,String> productPriceMap =productsList.stream().collect(Collectors.toMap((product)->product.id, (product)->product.name)); 
        System.out.println(productPriceMap);
	}

}
