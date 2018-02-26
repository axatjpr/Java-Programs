class Foreach{

	public static void main(String[] args) {
		int num[]= {1,2,3,4,5};
		int sum=0;
		for (int i:num)
		{
			System.out.println("value is :"+i);
			sum +=i;
		}
	System.out.println("Sum is:"+sum);
}
}