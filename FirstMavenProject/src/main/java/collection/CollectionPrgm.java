package collection;

import java.util.LinkedList;
import java.util.List;

public class CollectionPrgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> l = new LinkedList <Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		System.out.println(l);
		System.out.println(l.get(2));
		l.set(1, 5);
		System.out.println(l);
		System.out.println("Size " +l.size());
		System.out.println(l.isEmpty());
		System.out.println(l.contains(1));
		l.remove(2);
		System.out.println(l);
		System.out.println(l.indexOf(5));
		l.add(1);
		System.out.println(l);
		
	}

}
