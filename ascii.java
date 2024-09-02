package new_project;
import java.util.Scanner;
public class ascii {
 char ch;	  
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the character:");
		int ch=sc.next().charAt(0);
		int as_value=ch;
		System.out.print("Ascii value of is : " +as_value);
	}

}
