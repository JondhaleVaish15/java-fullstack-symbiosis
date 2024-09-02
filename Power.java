package new_project;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  double num1,num2,power;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the base number: ");
  num1=sc.nextInt();
  System.out.println("Enter the exponant number: ");
  num2=sc.nextInt();
  System.out.println("Power of the number: " + Math.pow(num1, num2));
 }

}
