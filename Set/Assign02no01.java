import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
class Hashdemo{

	HashSet<String> set=new HashSet<String>();

	boolean addCountry(String cname)
	{
		set.add(cname);
		return true;

	}
	String findCountry(String cname)
	{
		if(set.contains(cname))
			System.out.println( cname+" country is presnt in hashset");
	
		else 
			System.out.println(cname+" country is not found in hashset"); 
		
		return cname;

	}
	void display()
	{
		System.out.println("Printing element using Enumeration : ");
		Enumeration enumeration= Collections.enumeration(set);
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		System.out.println("Printing element using Iterator : ");
		Iterator<String> i=set.iterator();

		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}
}
class Assign02no01{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		Hashdemo h=new Hashdemo();
		System.out.println("Enter 5 country name : ");
		for(int i=0;i<5;i++)
		{
			String cname=sc.next();
			h.addCountry(cname);		
		}
		System.out.println("Enter name of country u want to find : ");
		String cname1=sc.next();
		h.findCountry(cname1);

		h.display();

	}
}
/* OUTPUT :
Enter 5 country name : 
India
Chin
Japan
Afrika
Pakistan
Enter name of country u want to find : 
India
India country is presnt in hashset
Printing element using Enumeration : 
Pakistan
Japan
Chin
India
Afrika
Printing element using Iterator : 
Pakistan
Japan
Chin
India
Afrika
*/


