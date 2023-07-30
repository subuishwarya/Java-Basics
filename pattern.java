package com.examples;

import java.util.Scanner;

public class pattern {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a value : ");
		int x=s.nextInt();
		for(int i=0;i<x;i++)
		{
			
			
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
