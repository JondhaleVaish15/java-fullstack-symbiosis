package new_project;
import java.util.Scanner;
public class palindrone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String num1,reverse="";
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number:");
         num1=sc.nextLine() ;
         for(int i=num1.length()-1;i>=0;i--) {
        	 reverse+=num1.charAt(i);
         }
         if(num1.equals(reverse)) 
        	 System.out.println("The number is palindrom");
         else
        	 System.out.println("The number is not palindrom");     
	}

}
