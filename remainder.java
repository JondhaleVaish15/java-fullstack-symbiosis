package new_project;
import java.util.Scanner;
public class remainder {
	 int num1,num2,num3,rem;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter first numbers: ");
	          num1=sc.nextInt();
	        System.out.println("Enter second numbers: ");
	          num2=sc.nextInt();
	        int reminder=num1-(num1/num2)*num2;
	        
	        System.out.print("Remainder of " +num1+"/"+num2 +"is: "+reminder);
	    }
	}


