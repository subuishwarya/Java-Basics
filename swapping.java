/*
 * 2.Given two integers N1 and N2, interchange the values of the variables without using a third variable and print it.

Input Format
The input consists of two integers separated by a space.

Output Format
The output prints the two integers separated by a space after swapping.

Sample Input
10 20
Sample Output
20 10
*/

package com.examples;
import java.util.Scanner;
public class swapping {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a value of N1 ");
		int a=s.nextInt();
		System.out.println("Enter a value of N2 ");
		int b=s.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swapped value of N1 is "+a);
		System.out.println("Swapped value of N1 is "+b);
		

	}

}
