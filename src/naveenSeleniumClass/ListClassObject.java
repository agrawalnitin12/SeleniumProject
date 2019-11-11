package naveenSeleniumClass;

import java.util.ArrayList;
import java.util.Iterator;

public class ListClassObject {

	int emp_no;
	String emp_name;
	int sal;
	
	
	public ListClassObject(int emp_no, String emp_name, int sal) {
		this.emp_no=emp_no;
		this.emp_name=emp_name;
		this.sal=sal;
		
	}
 
	public static void main(String[] args) {
		ListClassObject obj1 = new ListClassObject(1, "ram", 1000);
		ListClassObject obj2 = new ListClassObject(2, "shyam", 2000);
		ListClassObject obj3 = new ListClassObject(3, "hari", 3000);
		

		
		ArrayList<ListClassObject> al = new ArrayList<ListClassObject>();
		
		
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		System.out.println("********after adding 3 elements");
		Iterator<ListClassObject>it = al.iterator();
		while(it.hasNext()) {
			ListClassObject emp=it.next();
			System.out.println(emp.emp_name+","+emp.emp_no+","+emp.sal);
		}
		ListClassObject obj4 = new ListClassObject(4, "gauri", 5000);
			
			al.add(obj4);//add one more element
			System.out.println("******after adding one more element");
			it = al.iterator();
			while(it.hasNext()) {
				ListClassObject emp=it.next();
				System.out.println(emp.emp_name+","+emp.emp_no+","+emp.sal);
			}
			
			al.set(1, obj4);//add obj4 at index 1
		System.out.println("********add obj4 at index1"); 
			
			it = al.iterator();
			while(it.hasNext()) {
				ListClassObject emp=it.next();
				System.out.println(emp.emp_name+","+emp.emp_no+","+emp.sal);
			}
			
			al.clone();
			System.out.println("*****aftr making clones"); 
			it = al.iterator();
			while(it.hasNext()) {
				ListClassObject emp=it.next();
				System.out.println(emp.emp_name+","+emp.emp_no+","+emp.sal);
			}
al.remove(1);
System.out.println("*******after removing index 1 element");
			
it = al.iterator();
while(it.hasNext()) {
	ListClassObject emp=it.next();
	System.out.println(emp.emp_name+","+emp.emp_no+","+emp.sal);
}
	al.clear();
	System.out.println("********after clearing the array list");
	it = al.iterator();
	while(it.hasNext()) {
		ListClassObject emp=it.next();
		System.out.println(emp.emp_name+","+emp.emp_no+","+emp.sal);
	}	}
		
		
	}


