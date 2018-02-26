import java.util.Scanner;
class percentage

{
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int n;
		float sum=0.0f;
		System.out.println("enter numbr of subjects");
		n=sc.nextInt();
		
		float marks[] = new float[n];
		for (int i=0;i<n;i++)

		{
			marks[i]=sc.nextFloat();
			sum=sum+marks[i];

		}
		percentage p1=new percentage();
		float takepercentage =p1.percentagecalculate(sum,n);
		System.out.println(takepercentage+"%");


		float percentagecalculate(float sum,int n)
		{
			float percentageofuser(sum/(n*100))*100;
			return(percentageofuser);
		}

	}
}