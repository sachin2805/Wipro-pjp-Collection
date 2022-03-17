import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class Employee{
	int empID;
	String name;
	float salary;
	Scanner sc=new Scanner(System.in);
	
	TreeSet<Employee> s= new TreeSet<>(new CompareSalary());
	Employee(){
		
	}
	
	public Employee(int empID, String name, float salary) {
		super();
		this.empID = empID;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return " " + empID + " " + name + " " + salary+"\n" ;
	}
	boolean addEmployee()
	{
		for(int i=0;i<5;i++) {
		System.out.println("Enter the empid : ");
		int empid=sc.nextInt();
		System.out.println("Enter the name : ");
		String Name=sc.next();
		System.out.println("Enter the Salary : ");
		float Salary=sc.nextFloat();
		s.add(new Employee(empid,Name,Salary));
		}
		return true;
		
	}
	void display() {
		   for (Employee employee : s) {
	            System.out.println(employee);
	        }
	}
}
	
	

class CompareSalary implements Comparator<Employee> {
	   @Override public int compare(Employee e1, Employee e2)
	    {
	        if (e1.salary > e2.salary) {
	            return -1;
	        }
	        else if (e1.salary < e2.salary) {
	            return 1;
	        }
	        else {
	            return 0; //(e1.salary).compareTo(e2.salary);
	        }
	    }
}

public class Assign02no03 {
	public static void main(String[] args) {
	
		Employee e=new Employee();
		 System.out.println("Add Five Employee Data : ");
		e.addEmployee();
		
		System.out.println("The details of all employee in salary accending order : ");
		e.display();
	
	}
}
/* OUTPUT :
Add Five Employee Data : 
Enter the empid : 
01
Enter the name : 
Sachin
Enter the Salary : 
100000
Enter the empid : 
02
Enter the name : 
Sharda
Enter the Salary : 
98000
Enter the empid : 
03
Enter the name : 
Meenu
Enter the Salary : 
105000
Enter the empid : 
04
Enter the name : 
Akash
Enter the Salary : 
80000
Enter the empid : 
05
Enter the name : 
Nayana
Enter the Salary : 
94000
The details of all employee in salary accending order : 
 3 Meenu 105000.0

 1 Sachin 100000.0

 2 Sharda 98000.0

 5 Nayana 94000.0

 4 Akash 80000.0

*/