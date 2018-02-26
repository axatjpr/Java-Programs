import java.util.Scanner;

class Foreach1{

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		//size of array
		System.out.println("enter size of array");

		int n=sc.nextInt();
		int num [] =new int [n];
		int i;


		//array elements
		System.out.println("values of array  is ");
		for (i=0;i<n;i++)
		{
		
		num[i]=sc.nextInt();
		}
		//sum 
		int sum=0;
		for (int a:num)
		{
			System.out.println("value is :"+a);
			sum +=a;
		}
	System.out.println("Sum is:"+sum);
}
}