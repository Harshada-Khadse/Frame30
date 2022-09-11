package Collection;

import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add('H');
		ts.add('N');
		ts.add('K');
	//	ts.add(null);                   //nullpointerexception
		System.out.println(ts);
		
		TreeSet ts2=new TreeSet();
		ts2.add(20);
		ts2.add(56);
		ts2.add(5);
		ts2.add(46);
		
		System.out.println(ts2);
		
		ts2.remove(5);
		System.out.println(ts2);
		
		
		
	}

}
