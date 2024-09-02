package new_project;
import java.util.Scanner;
public class circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
         double cir,r,pi=3.14;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the radius");
      r=sc.nextInt();
      double ci=2*pi*r;
       System.out.println("Circumference of the circle is :"+ ci);
	}

}
