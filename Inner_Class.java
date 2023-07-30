package com.examples;

public class Inner_Class {

	public static void main(String[] args) {
		System.out.println("Hello");
		innerClass a=new innerClass();
		a.method();
		
		nerclass.method();
	}

	class nerclass{
		static String x="Love";
			public static void method() {
				System.out.println(x);
					}
			}
}
class innerClass{
	String s="hello";
		public void method() {
			System.out.println(s);
				}
		}

