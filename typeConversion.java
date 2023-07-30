package com.examples;
import java.util.Scanner;
public class typeConversion {

	public static void main(String[] args) {
		Scanner a= new Scanner(System.in);
		System.out.println("Enter a integer:");
		int b=a.nextInt();
		float c = (float)b;
		System.out.println("The Float value for the input is "+b);
	}

}
