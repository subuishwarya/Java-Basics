/*6.Problem Statement:
Write a Java program to compute the area of a polygon.
Area of a polygon = (n*s^2)/(4*tan(π/n))
where n is n-sided polygon and s is the length of a side.
Input Format
Input the number of sides on the polygon: 7
Input the length of one of the sides: 6
Output Format
The output prints represent the area of a polygon
Sample Input
10
5
Sample Output
The area is: 192.35522107345335
*/
package com.examples;
import java.util.Scanner;
public class area_of_polygon {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the n-sided of polygon : ");
		int a=s.nextInt();
		System.out.println("Enter the side lenght of polygon : ");
		int l=s.nextInt();
		double area=(a*Math.pow(l,2))/(4*Math.tan(Math.PI/a));
		System.out.println("Area of Polygon is "+area);
	}

}
