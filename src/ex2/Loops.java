package ex2;

import java.util.Iterator;

public class Loops {
public static void main(String[] args) {
	for (int i = 1; i <=5; i++) {
		for (int j = 1; j<=5-i; j++) {
			System.out.print(" ");
		
		}
			for (int j2 = 1; j2 <=i; j2++) {
				System.out.print("* ");
				
			
		}
			System.out.println();
	}
}
}
