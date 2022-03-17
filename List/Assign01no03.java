

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

class Assign01no03 {
	public static void main(String[] args)
	{
	
		Vector<Integer> v = new Vector<>();

	
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(60);
		v.add(70);
	
		System.out.println("The elements of the Vector is : " + v);

		System.out.println("Printing element using Enumeration : ");
	    Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
        System.out.println("Printing element using Iterator : ");
        Iterator<Integer> i=v.iterator();

        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        
        System.out.println("Printing element using ListIterator : ");
         ListIterator<Integer> li=v.listIterator();
      
        while(li.hasNext())
        {
            System.out.println(li.next());
        }
	}
}
/* OUTPUT :
The elements of the Vector is : [10, 20, 30, 40, 50, 60, 70]
Printing element using Enumeration : 
10
20
30
40
50
60
70
Printing element using Iterator : 
10
20
30
40
50
60
70
Printing element using ListIterator : 
10
20
30
40
50
60
70
*/