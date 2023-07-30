/*Total Expenses for the Event

The prime functionality of an Event Management System is budgeting. An Event Management System should estimate the total expenses incurred by an event and the percentage rate of each of the expenses involved in planning and executing an event. Nikhil, the founder of "Pine Tree" wanted to include this functionality in his company’s Amphi Event Management System and requested your help in writing a program for the same.
The program should get the branding expenses, travel expenses, food expenses and logistics expenses as input from the user and calculate the total expenses for an event and the percentage rate of each of these expenses.
Input Format
First input is a double value that corresponds to the branding expenses.
Second input is a double value that corresponds to the travel expenses.
Third input is a double value that corresponds to the food expenses.
Fourth input is a double value that corresponds to the logistics expenses.
Output Format
First line of the output should display the double value that corresponds to the total expenses for the Event.
Next four lines should display the percentage rate of each of the expenses.
Round off the output to two decimal digits.
Sample InputSample Output
20000
40000
15000
25000
Total expenses : Rs.100000.00
Branding expenses percentage : 20.00%
Travel expenses percentage : 40.00%
Food expenses percentage : 15.00%
Logistics expenses percentage : 25.00%
*/

package com.examples;
import java.util.Scanner;
public class expenses {

	public static void main(String[] args) {
		Scanner a= new Scanner(System.in);
		System.out.println("Enter the expenses for Branding:");
		int b=a.nextInt();
		System.out.println("Enter the expenses for Travel:");
		int c=a.nextInt();
		System.out.println("Enter the expenses for Food:");
		int d=a.nextInt();
		System.out.println("Enter the expenses for Logistics:");
		int e=a.nextInt();
		int expense = b+c+d+e;
		float x = (float)(c/expense)*100;
		System.out.println("Total Expenses: Rs."+(float)expense);
		System.out.println("Branding expenses percentage:"+(float)(b/expense)*100);
		System.out.println("Travel expenses percentage:"+x);	
		System.out.println("Food expenses percentage:"+(float)(d/expense)*100);
		System.out.println("Logistics expenses percentage:"+(float)(e/expense)*100);
	}

}
