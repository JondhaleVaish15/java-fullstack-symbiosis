package new_project;
import java.util.Scanner;
public class addition_array {
	int r,c;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no of rows");
	int r=sc.nextInt();
	System.out.println("Enter the no of columns");
	int c=sc.nextInt();
	int[][]m1=new int[2][2];
	int[][]m2=new int[2][2];
	int[][]sum=new int[2][2];
	System.out.println("Enter the first matrix");
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++) {
		m1[i][j]=sc.nextInt();
	}
	}
	System.out.println("Enter the second matrix");
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++) {
		m2[i][j]=sc.nextInt();
	}
		
	}
	System.out.println("sum of the two matrix");
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			sum[i][j]=m1[i][j]+m2[i][j];
		}
		
	}
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			System.out.println(sum[i][j]);
		}
		System.out.println();
	}		
}
}