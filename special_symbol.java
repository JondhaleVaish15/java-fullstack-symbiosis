package new_project;
import java.util.Scanner;
public class special_symbol {
    char c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the character:");
       char c=sc.next().charAt(0);
       if((c>='a' && c<='z')||(c>='A' && c<='Z')) {
    	   System.out.println("Given the character is alphabet:");  
       }
       else if(c>=0 && c<=9) {
    	   System.out.println("Given the character is digit:");
       }
       else {
    	   System.out.println("Given the character is special symbol:");
       }
	}

}
