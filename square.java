package new_project;
import java.util.Scanner;
public class square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double num,square;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number:");
		num=sc.nextDouble();
		square = num*num;
		System.out.println("Square root of " + Math.sqrt(num));
		}
	}


 