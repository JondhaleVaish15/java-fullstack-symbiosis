package new_project;
import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] num=new int[3];
		System.out.println("Enter the array elements :");
		for(int i=0;i<num.length;i++) {
			int value=sc.nextInt();
			num[i]=value;
		}
		System.out.println("Reverse array elements :");
		for(int i=num.length-1;i>=0;i--) {
			System.out.println(num[i]);
		}
}

}
