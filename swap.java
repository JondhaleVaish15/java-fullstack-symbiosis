package new_project;
import java.util.Scanner;
public class swap {
	 
  public static void swap_no(int num1,int num2) {
	  
	 num1=num1+num2;
      num2=num1-num2;
      num1=num1-num2;
      System.out.println("After the swapping");
      System.out.println("num1:"+num1);
      System.out.println("num2:"+num2);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         Scanner sc=new Scanner(System.in);	
         System.out.println("Enter the numberof num1:");
          int num1=sc.nextInt();
          System.out.println("Enter the numberof num2:");
          int num2=sc.nextInt();
          swap s=new swap();
 		 s.swap_no(num1,num2);
	}
}