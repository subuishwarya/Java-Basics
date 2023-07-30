package com.examples;

import java.util.Scanner;

public class removeConcecutiveVowels {
	static boolean isvowels(char a) {
		return (a=='a')||(a=='u')||(a=='o')||(a=='i')||(a=='e');
	}
	static void removeVowels(String str) {
		for(int i=0;i<str.length();i++) {
			if((!isvowels(str.charAt(i)))||(!isvowels(str.charAt(i-1)))) {
				System.out.print(str.charAt(i));
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		removeVowels(str);
	}
}
