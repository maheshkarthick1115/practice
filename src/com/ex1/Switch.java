package com.ex1;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value");
		int i = s.nextInt();
		switch (i) {
		case 1:
System.out.println("pa1ss");
			break;
		case 2:
System.out.println("fail");
			break;
		case 3:
System.out.println("high score");
			break;
		case 4:
System.out.println("super");
			break;

		default:
			System.out.println("error");
			break;
		}
	}

}
