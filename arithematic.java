/*
 * Q1.Problem statement
Aamir Khan is suffering from short-term memory loss and he has forgotten how to add, subtract, multiply, modulo division and division. Write a program to help Aamir to perform the basic arithmetic operations.
Input
5
2
Output
7
3
10

1

2

Input Format
The input consists of two integers

Output Format
The output prints result of basic arithmetic operations as shown in sample output.

Sample InputSample Output
5
2
7
3
10
1
2*/

package com.examples;
import java.util.Scanner;
public class arithematic {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number 1 :");
		int a= s.nextInt();
		System.out.println("Enter a number 2 :");
		int b=s.nextInt();
		System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
		System.out.println("Subtraction of "+a+" and "+b+" is "+(a-b));
		System.out.println("Multipication of "+a+" and "+b+" is "+(a*b));
		System.out.println("Divsion of "+a+" and "+b+" is "+(a/b));
		System.out.println("Modulus of "+a+" and "+b+" is "+(a%b));
	}

}
