package com.practise.java;

public class ReverseArray {

	public static void main(String[] args) {

		
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8,9};
		
		for (int a1 : a) {
			System.out.print(a1 +  " ");
		}
		
		int i=0;
		int j=a.length-1;
		
		while (i<j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] =temp;
			i++;
			j--;
			
		}
		
		for (int a2 : a) {
			System.out.print(a2 + " ");

			
		}
	}

}
