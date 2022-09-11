package Collection;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector v1=new Vector();
		Vector v2=new Vector(200); 
		Vector v3=new Vector(v2);
		
		
		
//		System.out.println("Vector is="+v1.capacity());          //by default =10
//		System.out.println("Vector is=" +v2.capacity());
//		System.out.println("Vector is=" +v3.capacity());
		
		v1.add("Harshada");
		v1.addElement("Khadse");
		v1.add(15);
		v1.add(50000);
		
		System.out.println("Vector= "+v1);
		v1.add(1,"Hemraj");
		System.out.println("Vector= "+v1);
		
//		for(int i=20;i<=30;i++)
//		{
//			v1.add(i);
//			System.out.print(v1);
//			System.out.println(v1.size());
//			System.out.println(v1.capacity());
//		}
		
	}

}
