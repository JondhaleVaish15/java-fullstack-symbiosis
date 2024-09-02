package new_project;
import java.util.Scanner;
public class student_grade {
 int rno;
 float marks;
 String sname;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the Roll No:");
  int rno=sc.nextInt();
  System.out.println("Enter the Student Name :");
  String sname=sc.next(); 
  System.out.println("Enter the Marks:");
  float marks=sc.nextFloat();
  if(marks>=90) {
	  System.out.println("Gread is =O");
  }
  else if(marks>=80) {
	  System.out.println("Gread is =A"); 
  }
  else if(marks>=70) {
	  System.out.println("Gread is =B"); 
  }
  else if(marks>=60) {
	  System.out.println("Gread is =C"); 
  }
  else if(marks>=50) {
	  System.out.println("Gread is =D"); 
  }
  else if(marks>=40 && marks<=35) {
	  System.out.println("Gread is =E"); 
  }
  else {
	  System.out.println("Gread is =Fail"); 
  }
	}

	}
