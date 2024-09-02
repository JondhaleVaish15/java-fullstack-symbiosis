package new_project;
import java.util.Scanner;
public class rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int l,w,area;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the length :");
         l=sc.nextInt();
         System.out.println("Enter the width :");
         w=sc.nextInt();
         area=l*w;
         System.out.println("Area of rectangle :"+area);
        		 
	}

}
