package com.examples;
import java.util.Scanner;
public class bonanza {
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);	
	char x,y,z;
	int a,b,c;
	x =sc.next().charAt(0);
	a =sc.nextInt();
	y =sc.next().charAt(0);
	b =sc.nextInt();
	z =sc.next().charAt(0);
	c =sc.nextInt();
	if((x==y && x==z)&&(a==b && a==c)) {
		System.out.println("Double bonanza");
	}
	else if((x==y && x==z)||(a==b && a==c)) {
		System.out.println("Bonanza");
	}
	else {
		System.out.println("No bonanza");
	}
	}
}
