package new_project;
import java.util.Scanner;
public class average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		double average;
Scanner sc=new Scanner(System.in);
int[] array=new int [5];
System.out.println("Enter the array elements:");
for(int i=0;i<array.length;i++) {
	 int no=sc.nextInt();
     array[i]=no;
}
for(int i=0;i<array.length;i++) {
	 num=num+array[i];	 
}    	 
average=num/array.length;
System.out.println("Average of array"+average);	 	 
}

	}


