package com.examples;
import java.util.Scanner;
public class countVowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int c=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==('a')||s.charAt(i)==('e')||s.charAt(i)==('o')||s.charAt(i)==('i')||s.charAt(i)==('u')) {
				{
					c++;
					System.out.println("vowels : "+s.charAt(i)+" in position "+i);
				}
			}
		}
		System.out.println(c);
	}

}
