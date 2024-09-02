package new_project;
import java.util.Scanner;
public class ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int  temp;
		 int array[] = new int[3];
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the elements:"); 
	        for (int i = 0; i < array.length; i++) 
	        {
	            array[i] = sc.nextInt();
	        }
	        for (int i = 0; i < array.length; i++) 
	        {
	            for (int j = i + 1; j < array.length; j++) 
	            {
	                if (array[i] > array[j]) 
	                {
	                    temp = array[i];
	                    array[i] = array[j];
	                    array[j] = temp;
	                }
	            }
	        }
	        System.out.print("Ascending Order:");
	        for (int i = 0; i < array.length - 1; i++) 
	        {
	            System.out.print(array[i] + ",");
	        }
	        System.out.print(array[array.length- 1]);
	  } 
}
	            
	  
