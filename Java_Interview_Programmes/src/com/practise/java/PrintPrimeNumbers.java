package com.practise.java;

public class PrintPrimeNumbers {

	public static void main(String[] args) {

		
		// prime number = a number which is divisible by 1 and it self is called prime numbers
		int n=7;
		int count =0;
		for (int i = 1; i <=7; i++) {
			if (n%i==0) {
				count++;
				
			}
			
		}
		if (count  ==2) {
			System.out.println("It is prime number");
		}
	}

}
