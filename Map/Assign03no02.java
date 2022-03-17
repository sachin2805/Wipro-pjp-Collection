import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Assign03no02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		TreeMap<String, String> tm = new TreeMap<>();

		tm.put("Sachin", "7972897299");
		tm.put("Nayana", "9999999999");
		tm.put("Akash", "7777777777");


		System.out.println("Enter name u want to find number : ");
		String name=sc.next();
		if(tm.containsKey(name))
		{
			System.out.println("Name : "+name+"\nPhone Number : "+tm.get(name));
		}


		System.out.println("Enter number u want to find name : ");
		String number=sc.next();
		if(tm.containsValue(number))
		{
			System.out.println("Name : "+tm.ceilingKey(number)+"\nPhone Number : "+number);
		}
		System.out.println(" All Phone Data :");
		tm.entrySet().forEach(entry->{
			System.out.println(entry.getKey() + " = " + entry.getValue());  
		});
	}
}
/* OUTPUT:
Enter name u want to find number : 
Sachin
Name : Sachin
Phone Number : 7972897299
Enter number u want to find name : 
7777777777
Name : Akash
Phone Number : 7777777777
 All Phone Data :
Akash = 7777777777
Nayana = 9999999999
Sachin = 7972897299
*/