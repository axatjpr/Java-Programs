import java.util.Scanner;
class ScT
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);

		

		System.out.println("enter Size of array");
		int n =sc.nextInt();

		int arr[]= new int[n];

		int i;
		for (i=0;i<arr.length;i++) /* for (i=0;i<arr.length;i++)*/
			{
				arr[i]=sc.nextInt();
			}

		for (i=0;i<n;i++)
			{

				System.out.println(arr[i]);
			}
		
	}
}