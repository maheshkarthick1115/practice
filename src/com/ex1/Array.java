package com.ex1;

public class Array {
	public static void main(String[] args) {
		int i[] = new int[4];
		i[0] = 2323;
		i[1] = 2323;
		i[2] = 2323;
		i[3] = 2323;
		System.out.println(i[2] + i[3]);
		System.out.println();
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
		System.out.println();
		int k = 0;
		do {
			System.out.println(i[k]);
			k++;
		} while (k < 4);
		 System.out.println();
		int l = 0;
		while (l < 4) {
			System.out.println(i[l]);
			l++;

		}

	}

}
