package new_project;
import java.util.Scanner;
public class min_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
       int[]array=new int [5];
		
		
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the 5 number");
     
		for (i=0;i<array.length; i++) {
			array[i]=sc.nextInt();
		}
		  int min=array[0];
		  int max=array[0];
		  for (i=0;i<array.length; i++) {
			  
		  if (min>array[i]) {
		    min= array[i];
		  
		  }
		  else if (max<array[i]) { 
		    max = array[i];
			  
		  }
		}
    System.out.println("Minimum no is :"+min);
    System.out.println("Maximum no is :"+max);
		
	}

}		

