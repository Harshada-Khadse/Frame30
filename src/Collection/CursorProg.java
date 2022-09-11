package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CursorProg {

	public static void main(String[] args) {
		Vector v1=new Vector();
		for(int i=1;i<=10;i++)
		{
			v1.add(i);
		}
		System.out.println(v1);
		
	/*	Enumeration e=v1.elements();
		while(e.hasMoreElements())
		{
			int value=(int) e.nextElement();
			if(value%2==0)
				System.out.println(value);
		}
		for(;e.hasMoreElements();)
		{
			System.out.println(e.nextElement());
		} */
		
//        Iterator i=v1.iterator();
//        while(i.hasNext())
//        {
//        	int value1=(int) i.next();
//        	if(value1%2==0)
//        	{
//        		System.out.println(value1);
//        	}
//        	else
//        	{
//        		i.remove();
//        	}
//        }
//        System.out.println(v1);
		
		ListIterator li=v1.listIterator();
		while(li.hasNext())
		{
			int value2=(int) li.next();
			if(value2==5)
			{
				li.remove();
			}
			else if(value2==2)
			{
				li.add(22);
			}
			else if(value2==3)
			{
				li.set(33);
			}
		}
		System.out.println(v1);
        
	}

}
