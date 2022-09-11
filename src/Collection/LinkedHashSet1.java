package Collection;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("Harshada");
		lhs.add('B');
		lhs.add("Nikhil");
		lhs.add("Mohit");
		lhs.add("Sakshi");
		lhs.add(10);
	//	lhs.add("Harshada");
		lhs.add(null);
		lhs.add(null);
		
		System.out.println(lhs);
		
		lhs.remove('B');
		System.out.println(lhs);
		
		
		System.out.println(lhs.isEmpty());
		System.out.println(lhs.contains(10));
		}

}
