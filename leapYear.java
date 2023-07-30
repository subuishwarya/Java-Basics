package com.examples;
import java.util.Scanner;
public class leapYear {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int l= s.nextInt();
		if(l%4==0) {
			System.out.println("leap year");
		}
		else {
			System.out.println("not a leap year");
		}

	}

}
