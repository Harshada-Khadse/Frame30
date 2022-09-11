package Collection;

import java.util.LinkedList;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class LinkList {

	public static void main(String[] args) {
		LinkedList ll1=new LinkedList();
		LinkedList ll2=new LinkedList(ll1);
		
		//System.out.println(ll2);
		
		System.out.println(ll1.size());
		System.out.println(ll1.isEmpty());
		
		ll1.add("Harshada");
		ll1.add("Hemraj");
		ll1.add("Khadse");
		ll1.add('+');
		ll1.add(111);
		ll1.add(null);
		ll1.add("Harshada");
		ll1.add(null);
		System.out.println(ll1);
		
		ll1.addFirst("Miss Harshada");
		System.out.println(ll1);
		
		ll1.addLast("Mohit");
		System.out.println(ll1);
		
		System.out.println(ll1.contains('+'));
		System.out.println(ll1.indexOf("Khadse"));
		System.out.println(ll1.getFirst());
		System.out.println(ll1.getLast());
		
		System.out.println(ll1);
		ll1.poll();
		
		System.out.println(ll1);
		
		ll1.pollFirst();
		ll1.pollLast();
		System.out.println(ll1);
		
		ll1.removeFirst();
		ll1.removeLast();
		System.out.println(ll1);
		
		for(int i=0;i<ll1.size();i++)
		{
			System.out.println(ll1.get(i));
		}
		
		System.out.println("*****************************");
		
		for(Object value:ll1)
		{
			System.out.println(value);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
