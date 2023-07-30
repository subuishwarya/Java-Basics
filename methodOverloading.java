package com.examples;

public class methodOverloading {

	static int add(int x, int y) {
		int c=x+y;
		return c;
	}
	static float add(float x, float y) {
		float c=x+y;
		return c;
	}
	static double add(double x, double y) {
		double c=x+y;
		return c;
	}

	public static void main(String[] args) {
		int c=add(10,20);
		float d=add(10.0f,20.7f);
		double e=add(10,20);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
	}

}
