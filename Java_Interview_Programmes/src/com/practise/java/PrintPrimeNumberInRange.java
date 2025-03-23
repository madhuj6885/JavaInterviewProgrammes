package com.practise.java;


public class PrintPrimeNumberInRange {

	public static void main(String[] args) {

		
	int m=50, n=100;
	for (int i = m; i < n; i++) {
		int count =0;
		for (int j = 1; j <=i; j++) {
			if (i%j ==0) {
				count++;
			}
			
		}
		if (count ==2) {
			System.out.println(i + " is a prime number ");
		}
		
	}
		
		
	}

}
