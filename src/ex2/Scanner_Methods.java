package ex2;

import java.util.Scanner;

public class Scanner_Methods{
	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);

		System.out.println("enter the first name:");
		String s = m.next();
		System.out.println(s);

		System.out.println("enter the last name:");
		String s1 = m.nextLine();
		System.out.println(s1);

		System.out.println("enter the year:");
		int i = m.nextInt();
		System.out.println(i);

		System.out.println("enter the salary");
		float f = m.nextFloat();
		System.out.println(f);

		System.out.println("enter the sec:");
		char c = m.next().charAt(0);
		System.out.println(c);

		System.out.println("enter the date:");
		byte b = m.nextByte();
		System.out.println(b);

		System.out.println("enter the month:");
		short k = m.nextShort();
		System.out.println(k);

		System.out.println("enter the phone num:");
		long l = m.nextLong();
		System.out.println(l);

		System.out.println("enter the time:");
		double d = m.nextDouble();
		System.out.println(d);

		System.out.println("enter the department:");
		String q = m.next().toString();
		System.out.println(q);

		System.out.println("enter the true:");
		boolean v = m.nextBoolean();
		System.out.println(v);
	}

}
