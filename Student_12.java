package Bookapp;
import java.util.Hashtable;
class StudentData{
	String name;
	String DOB;
	String cource;
	public StudentData(String name, String dOB, String cource) {
	
		this.name = name;
		this.DOB = dOB;
		this.cource = cource;
	}
	public void display() {
		System.out.println("name :"+name+"  date of birth :"+DOB+"  cource :"+cource);
	}
}
 public class Student_12{
	 public static void main(String[] args) {
		 String name,DOB,cource;
		 Hashtable<Integer,StudentData>hashtable=new Hashtable<Integer, StudentData>();
		hashtable.put(1, new StudentData("vaishnavi","24/7/2005","java"));
		hashtable.put(2, new StudentData("Sonal","03/3/2005","java"));
		hashtable.put(3, new StudentData("sakshi","02/5/2005","java"));
		hashtable.put(4, new StudentData("Samruddhi","12/2/2005","java"));
		for(Integer rollno:hashtable.keySet()) {
			 StudentData s=hashtable.get(rollno);
			 System.out.println("roll no :"+rollno);
			 s.display();
		}
		 }
 }
