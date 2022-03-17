import java.util.ArrayList;
import java.util.List;

// ref: http://hg.openjdk.java.net/jdk7/jdk7/jdk/file/00cd9dc3c2b5/src/share/classes/java/util/ArrayList.java
class MyArrayList<E> extends ArrayList<E> {
	@Override
	public boolean add(E e) {
		if (e instanceof Integer || e instanceof Float || e instanceof Double) {
			super.add(e);
			return true;
		} else {
			throw new ClassCastException("String not support");
		}
	}
}

public class Assign01no02 {

	public static void main(String[] args) {
		ArrayList<Object> al = new MyArrayList<>();
		
		try {
			al.add(1);
			al.add(2);
			al.add(0.3);
			al.add(0.0000000004);
			//al.add("Sachin"); // not supported
		
		} catch (Exception e) {
			System.out.println(e);	
		}
		
		System.out.println(al);
	}
}
/* OUTPUT :
[1, 2, 0.3, 4.0E-10]

*/