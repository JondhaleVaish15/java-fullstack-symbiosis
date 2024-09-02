package new_project;
import java.util.Scanner;
public class math_operator {
 int choice;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  System.out.println("athematical operator");
  System.out.println("1 Addition");
  System.out.println("2 Substraction");
  System.out.println("3 Multiplication");
  System.out.println("4 Division");
  System.out.println("5 Module");
  System.out.println("Enter the choice");
   int choice=sc.nextInt();
      switch(choice) {
   case 1:
	   System.out.println("a= ");
	   int a=sc.nextInt();
	   System.out.println("b= ");
	    int b=sc.nextInt();
	    int c=a+b;
	   System.out.println("c= "+c);
	   break;
   case 2:
	   System.out.println("a= ");
	    a=sc.nextInt();
	   System.out.println("b= ");
	    b=sc.nextInt();
	    c=a-b;
	   System.out.println("c= "+c);
	   break;	 
   case 3:
	   System.out.println("a= ");
	    a=sc.nextInt();
	   System.out.println("b= ");
	   b=sc.nextInt();
	    c=a*b;
	   System.out.println("c= "+c);
	   break;	
   case 4:
	   System.out.println("a= ");
	   a=sc.nextInt();
	   System.out.println("b= ");
	    b=sc.nextInt();
	   c=a/b;
	   System.out.println("c= "+c);
	   break;	
   case 5:
	   System.out.println("a= ");
	    a=sc.nextInt();
	   System.out.println("b= ");
	    b=sc.nextInt();
	    c=a%b;
	   System.out.println("c= "+c);
	   break;
	   default:
	   }
}

}
