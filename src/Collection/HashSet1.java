package Collection;

import java.util.HashSet;
import java.util.Vector;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet a=new HashSet();
		HashSet b=new HashSet(500);
		HashSet c=new HashSet(500,100);
		
		System.out.println("HashSet ="+b.size());     //0
		HashSet d=new HashSet(b);
		System.out.println("HashSet ="+b.size());    //0
		
		a.add("Harshada");
		a.add("H");
		a.add("K");
		System.out.println(a);      //[H, K, Harshada]
		a.add("H");
		System.out.println(a);      //[H, K, Harshada]
		a.add(null);
		System.out.println(a);     //[null, H, K, Harshada]
		a.add(null);
		System.out.println(a);    //[null, H, K, Harshada]
		
		
		
		  Vector v1=new Vector();
		  v1.add("abc");
		  v1.add("xyz");
		  v1.add("abc");
		  v1.add("xyz");
		  v1.add("Nilhil");
		  System.out.println(v1);          //[abc, xyz, abc, xyz, Mohit]
		  
		  HashSet z=new HashSet(v1);
		  System.out.println(z);           //[Mohit, abc, xyz]
		  
		  v1=new Vector(z);
		  System.out.println(v1);         //[Mohit, abc, xyz]


		

	}

}
