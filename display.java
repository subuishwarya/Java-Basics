/*"Pine Tree" Company has signed up a big time Event Management deal from the Rotary Youth Club for a Trade Fair organized at Codissia Complex, wherein all startup companies in the Software industry are demonstrating their latest products and services and meet with industry partners and Customers.

Amphi Event Management System has to be modified to write a piece of code that will get the input of the number of events to be hosted for the Fair at Codissia from its users and display the same. Help the company to accomplish the requirement.
Input Format
First line of the input is an integer that corresponds to the number of events to be hosted at Codissia.
Output Format
Output should display the number of events to be hosted at Codissia.

Sample InputSample Output
50
Number of events hosted in Codissia is 50
Time Limit: - ms Memory Limit: - kb Code Size: - kb
*/

package com.examples;

import java.util.Scanner;

public class display {
	public static void main(String[] args) {
	Scanner a= new Scanner(System.in);
	System.out.println("Enter the number of events:");
	int b=a.nextInt();
	System.out.println("Number of events hosted in Codissis is "+b);
}
}