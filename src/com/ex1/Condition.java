package com.ex1;

import java.util.Scanner;

public class Condition {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the value");
		int i = s.nextInt();
		if (i >= 35 && i < 50) {
			System.out.println("pass");

		} else if (i >= 50 && i < 60) {
			System.out.println("D grade");
		} else if (i >= 60 && i < 70) {
			System.out.println("C grade");
		} else if (i >= 70 && i < 80) {
			System.out.println("B grade");
		} else if (i >= 80 && i < 90) {
			System.out.println("A grade");
		} else if (i >= 90 && i <= 100) {
			System.out.println("A+ grade");
		}

		else {
			System.out.println("fail");

		}
	}

}
