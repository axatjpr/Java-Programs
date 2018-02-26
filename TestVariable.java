public class TestVariable
{
	/*int age; */
	 int age;
	public  void personAge()
	{
	
	age =age+7;
	System.out.println("person age is :" +age);
	System.out.println("OLD");
	}
	public static void main(String args[])
	{

		/*TestVariable.personAge();*/
	TestVariable test =new TestVariable();
	test.personAge();
	TestVariable test1 = new TestVariable();
	test1.personAge();
	}
	}