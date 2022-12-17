package com.ex1;

import java.util.Scanner;

public class Arithmetic1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		 
		System.out.println("enter the value of a");
		int i = s.nextInt();
		System.out.println(i);
		 
		System.out.println("enter the value of b");
		int i1 = s.nextInt();
		System.out.println(i1);
		
		System.out.print("sum:"+(i+i1));
		//System.out.println(i+i1);
		System.out.print("sub:");
		System.out.println(i-i1);
		System.out.print("mul:");
		System.out.println(i*i1);
		System.out.print("div:");
		System.out.println(i/i1);
		System.out.print("module:");
		System.out.println(i%i1);
		
	}

}
