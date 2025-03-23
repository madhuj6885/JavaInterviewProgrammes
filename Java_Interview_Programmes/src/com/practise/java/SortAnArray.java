package com.practise.java;
import java.util.*;

public class SortAnArray {

	public static void main(String[] args) {

		
		int[] a = {3,1, 2, 4, 5, 8, 9, 7, -2, 0};
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				if (a[j] < a[i]) {            //3 >1 
					int temp =  a[i] ;        //temp=3;
					a[i] = a[j];            //3 = 1;
					a[j] =temp;             //1 =3
					
					
				}
				
			}
			
			
		}
		
//		System.out.println(Arrays.sort(a).toString());;
		
		for (int n : a) {
			System.out.print(n+ " ");
			
		}
		
	}

}
