import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Assign03no01 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String, String> mapObj = new HashMap<>();
		
		ArrayList<String> al1=new ArrayList<>();
		ArrayList<String> al2=new ArrayList<>();


		System.out.println("Enter the 2 country details : ");
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter the Country name : ");
			String cname=sc.next();
			System.out.println("Enter the capital of "+cname+" : ");
			String capname=sc.next();
			mapObj.put(cname, capname);
			al1.add(cname);
			al2.add(capname);
		}

		System.out.println("Enter Country u want to find capital : ");
		String countryName=sc.next();
		if(mapObj.containsKey(countryName))
		{
			System.out.println("Country : "+countryName+"\nCapital : "+mapObj.get(countryName));
		}
		else 
			System.out.println("Not found");


		System.out.println("All data of hashMap : ");
			System.out.println(mapObj);
			System.out.println("All Country name using arraylist : ");
			   for (String e : al1) {
		            System.out.println(e);
		        }
			   
			   System.out.println("All Capital name using arraylist : ");
			   for (String e : al2) {
		            System.out.println(e);
		        }
			
			

		/*int i=1;
		do {
		System.out.println("Menu : \n1.Save Country and Capital \n2.Find Capita \n3.Display HashMap \n4.Exit");
		System.out.println("Enter the choice : ");
		int ch=sc.nextInt();

		switch (ch) {
		case 1: {
			HashMapDemo h=new HashMapDemo();
			h.SaveCountryCapital();
			break;
		}
		case 2: {	HashMapDemo h=new HashMapDemo();
		System.out.println("Enter Country u want to find capital : ");
		String countryName=sc.next();
		h.getCapital(countryName);

			break;
		}
		case 3: {
			HashMapDemo h=new HashMapDemo();
			h.display();

			break;
		}
		case 4: {
			i=0;
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + ch);
		}
		}while(i!=0);*/
	}
}
/* OUTPUT :
Enter the 2 country details : 
Enter the Country name : 
India
Enter the capital of India : 
Delhi
Enter the Country name : 
Japan
Enter the capital of Japan : 
Tokyo
Enter Country u want to find capital : 
India
Country : India
Capital : Delhi
All data of hashMap : 
{Japan=Tokyo, India=Delhi}
All Country name using arraylist : 
India
Japan
All Capital name using arraylist : 
Delhi
Tokyo
*/
