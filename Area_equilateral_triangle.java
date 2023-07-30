/*
 5.Problem Statement:
Area of an equilateral triangle:
Ragu's grandparents have their land in an equilateral triangle shape. They have to sow apple seeds for cultivation. Calculate the total area of the land so that they can buy the required amount of seeds. Round off the area to two decimal places.
Input Format
Input consists of a single integer value s that represents the side of an equilateral triangle.
Output Format
The output prints represent the area of an equilateral triangle.
Round off the output to two decimal places.
Sample Input 
4
Sample Output
6.93
*/
package com.examples;
import java.util.Scanner;

public class Area_equilateral_triangle {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the value of side : ");
		int a=s.nextInt();
		double area =(Math.sqrt(3)/4)* Math. pow(a,2);
		System.out.println("Area of an equilateral triangle:"+area);
	}

}
