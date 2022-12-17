package ex2;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashmap {
	public static void main(String[] args) {
		Map<Integer, String> m = new LinkedHashMap<>();
		m.put(15, "karthick");
		m.put(11, "mahesh");
		m.put(14, "kumaran");
		m.put(29, "indra");
		m.put(null, "who");
		m.put(1509, null);
		System.out.println(m);

		int i = m.size();
		System.out.println(i);

		String st = m.get(11);
		System.out.println(st);
		
		Set<Integer> ke = m.keySet();
		System.out.println(ke);
		
		Collection<String> v = m.values();
		System.out.println(v);
		
		boolean kk = m.containsKey(11);
		System.out.println(kk);
		
		boolean k = m.containsValue("indra");
		System.out.println(k);
		
		Set<Entry<Integer, String>> ee = m.entrySet();
		System.out.println(ee);
	}

}
