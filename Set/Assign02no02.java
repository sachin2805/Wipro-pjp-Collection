
import java.util.Iterator;
import java.util.TreeSet;

public class Assign02no02 {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
	
		set.add("Sachin");
		set.add("Sakshi");
		set.add("Meenu");
		set.add("Suraj");
		
		Iterator<String> it = set.iterator();
		String find = "Sachin";
		boolean result = false;
		
		while (it.hasNext()) {
			if (it.next().equals(find)) {
				result = true;
				break;
			}
		}
		
		if (result) System.out.println(find + " is exists in TreeSet");
		else System.out.println(find + " doesn't exist in TreeSet");

	}
}
/* OUTPUT :
 Sachinis exists in TreeSet
*/
