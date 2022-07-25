package com.practice;

import java.util.Arrays;

public class ParallelArraySort {

	public static void main(String[] args) {
		
		int[] array=new int[] {1,6,5,2,3,4};

		for (int i : array) {  
            System.out.print(i+" ");  
        }  

		Arrays.parallelSort(array);
		
		System.out.println(" ");  
		
		for (int i : array) {  
            System.out.print(i+" ");  
        }
		
	}

}
