package Collection;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();          //by default capacity=10
		ArrayList al2=new ArrayList(800);         //capacity=800
		ArrayList al3=new ArrayList(al2);
		
		System.out.println(al1.size());
		System.out.println(al2.size());
		System.out.println(al3.size());
		
		al1.add("Harshada");
		al1.add("Khadse");
		al1.add("7666411125");
		al1.add('A');
		
		
		System.out.println(al1.size());             //size=4
		System.out.println("ArrayList=" +al1);
        al1.add(1,"Hemraj");
        System.out.println("ArrayList=" +al1);   //add hemraj in 1st index
        
        for(int i=5;i<=10;i++)
        {
        	al1.add(i);
        }
        System.out.println("ArrayList=" +al1);           //add 5 to 10
        al1.addAll(al1);
        System.out.println("ArrayList=" +al1);
        
//        al1.clear();
//        System.out.println("ArrayList=" +al1);
        System.out.println("Is al1 contain Harshada=" +al1.contains("Harshada"));
        
        
        System.out.println("Value at index 8=" +al1.get(12));
        
        System.out.println("Index off Khadse=" +al1.indexOf("Khadse"));
        System.out.println("Last index of Khadse=" +al1.lastIndexOf("Khadse"));
        
        System.out.println("al1=" +al1);
        al1.remove(5);
        System.out.println("ArrayList=" +al1);
        
        al1.set(0,"Miss Harshada" );
        System.out.println("AyyaList=" +al1);
        
        
	}

}
