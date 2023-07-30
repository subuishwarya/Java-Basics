package com.examples;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		String s,reverse="";
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		int length =s.length();
		for(int i=length-1; i>=0; i--) {
			reverse =reverse+s.charAt(i);
	}
	if(s.equals(reverse)) {
		System.out.println(s+" palindrome");
	}
	else {
		System.out.println(s+" not a palindrome");
	
	}
	}

}
