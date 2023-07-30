/*
3.Celsius to Fahrenheit
Write a program to convert Celsius to Fahrenheit. The formula is as follows, F = 1.8 C + 32.
Question Instructions:
Create a driver class named Main.
The solution code should be written inside the main method() of the Main class
Input Format
The input consists of Celsius (double value).
Output Format
The output prints Fahrenheit(double value).
Constraints
Read and print Double values only.

Sample Input
51
Sample Output
123.8
Sample Input
48
Sample Output
118.4
*/
package com.examples;
import java.util.Scanner;
public class Celsius_to_Fahrenheit {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the celsius value: ");
		double c=s.nextInt();
		double f=1.8*c + 32;
		System.out.println("Enter the Fahrenheit value of "+c+" is "+f);

	}

}
