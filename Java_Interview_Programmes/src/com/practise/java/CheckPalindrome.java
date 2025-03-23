package com.practise.java;

public class CheckPalindrome {

	public static void main(String[] args) {

		int n = 12121;
		int temp=n;
		int rev=0;
		
		while (n>0) {
			int rem = n%10;
			
			rev = rev*10 + rem;
			n=n/10;
			
		}
		if (temp == rev) {
			System.out.println("its a palindrome");
} else {
	System.out.println(" not a palindrome");
}
	}

}
