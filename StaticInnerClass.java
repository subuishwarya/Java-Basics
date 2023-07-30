package com.examples;

public class StaticInnerClass {
	static int num=30;
	static class Inner{
		void nm() {
			System.out.println("num : "+num);
		}
	}
	public static void main(String[] args) {
		StaticInnerClass.Inner in=new StaticInnerClass.Inner();
		in.nm();

	} 

}
