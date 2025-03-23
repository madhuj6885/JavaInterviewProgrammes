package com.practise.java;

import java.util.Iterator;

public class ReverseString {
	
	public static void main(String[] args) {
//		String name ="Madhu";
		
		String sent = "iam from india and i love india";
		
	String [] s = sent.split(", ");
	String rev ="";
	
	for (int i = s.length-1; i >=0 ; i--) {
		
		rev = rev + " " + s[i] ; 
	}
	
	System.out.println(rev);
	}

}

