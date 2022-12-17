package ex2;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("empId");
		int i = s.nextInt();
		System.out.println(i);

		System.out.println("empName");
		String s1 = s.next().toString();
		System.out.println(s1);

		System.out.println("emp phone num");
		long l = s.nextLong();
		System.out.println(l);

		System.out.println(":emp salary");
		float f = s.nextFloat();
		System.out.println(f);

		System.out.println("empGender");
		char c = s.next().charAt(0);
		System.out.println(c);

		System.out.println("empCity");
		String k = s.next().toString();
		System.out.println(k);
	}

}
