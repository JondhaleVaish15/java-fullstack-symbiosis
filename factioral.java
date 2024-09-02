package new_project;
import java.util.Scanner;
public class factioral {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number:");
       int num=sc.nextInt();
    int i=1,fact=1;
    while(i<=num) {
    	fact*=i;
    	i++;
    }
      System.out.println("Factorial no :"+fact);
     
     
	}
}
