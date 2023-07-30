/*
4.Write a program to left shift(signed) a value by 2.
Input Format
Input to get the integer n.
Output Format
Display the value after left shift.
Constraints
n (integer type).
Sample Input
20
Sample Output
80
*/
package com.examples;
import java.util.Scanner;
public class left_shift {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the value to do left shift : ");
		int c=s.nextInt();
		int l=c<<2;
		System.out.println("Left shift of "+c+" is "+l);
	}

}
