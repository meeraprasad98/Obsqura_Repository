package collection;

import java.util.HashSet;
import java.util.Set;

public class NewPrgm1 {

	public static void main(String[] args) {
		Set<Integer> i = new HashSet<Integer>();
		Set<Integer> s = new HashSet<Integer>();
		i.add(2);
		i.add(3);
		i.add(4);
		s.add(2);
		s.add(3);
		s.add(5);
		System.out.println(i);
		System.out.println(s);
		i.addAll(s);
		System.out.println(i);
		System.out.println(i.size());
		System.out.println(i.isEmpty());
		System.out.println(i.contains(7));
		System.out.println(i.containsAll(i));
		i.remove(4);
		System.out.println(i);
		i.removeAll(s);
		System.out.println(i);

	}

}
