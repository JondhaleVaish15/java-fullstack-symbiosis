package new_project;
import java.util.Scanner;
public class simple
{
	 float principle,rate_of_interest,year,simple_interest,componant_interest;
	public static void main(String[] args)
	{
  Scanner sc=new Scanner(System.in); 
  System.out.println("-------Simple Interest------");
  
  System.out.println("Enter the principle =");
   float principle=sc.nextInt();
   
   System.out.println("Enter the rate of Interest =");
   float rate_of_interest=sc.nextInt();
   
   System.out.println("Enter the Year =");
   float year=sc.nextInt();
   
    float simple_interest=principle*rate_of_interest*year/100;
   
   System.out.println("Simple Interest =" +simple_interest);
   System.out.println();
   
   System.out.println("-------Componant Interest------");
   
  float componant_interest=principle*((1 + rate_of_interest /year )*rate_of_interest*year);
   System.out.println("Componant Interest =" +componant_interest);
   
	}

}
