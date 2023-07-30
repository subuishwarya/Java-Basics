package com.examples;

import java.util.Scanner;

public class email {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String email;
		email=sc.nextLine();
		if(email.contains("com")||email.contains("net")||email.contains("in")||email.contains("co")) {
			System.out.println("Valid Email");
		}
		else {
			System.out.println("not a valid email");
		}

	}

}
