package ex2;

import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
	public static void main(String[] args) {
		List<String> s = new LinkedList<>();
		s.add("karthick");
		s.add("mahesh");
		s.add("indra");
		System.out.println(s);

		int i = s.size();
		System.out.println(i);

		String str = s.get(2);
		System.out.println(str);

		int in = s.indexOf("mahesh");
		System.out.println(in);

		boolean b = s.contains("karthick");
		System.out.println(b);

		s.set(1, "maheshkarthick");
		System.out.println(s);

//		s.remove(2);
//		System.out.println(s);

		//s.clear();
		//System.out.println(s);

		List<String> k = new LinkedList<>();
		k.add("indra");
		k.add("kumaran");

		System.out.println(k);
		
//		k.addAll(s);
//		System.out.println(k);
//		
//		k.retainAll(s);
//		System.out.println(k);
//		
		k.removeAll(s);
		System.out.println(k);

	}

}
