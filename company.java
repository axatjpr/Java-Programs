class Company
{
	char company_name;
	int address;
	int number_of_branches;


Company()
    {
       address = number_of_branches = 0;
    }
Company(char str, int num1, int num2)
   {
       company_name= str;
	       address =num1;
	       number_of_branches = num2;
	   }
	   public char getcompany_name() {
	       return company_name;
	   }
	   public void setcompany_name(char company_name) {
	       this.company_name = company_name;
   }
   public int getaddress() {
       return address;
   }
   public void setaddress(int address) {
       this.address = address;
   }
   public int getnumber_of_branches() {
       return number_of_branches;
   }
   public void setnumber_of_branches(int number_of_branches) {
       this.number_of_branches = number_of_branches;
   }

   public static void main(String args[])
   {
       //default constructor
       Company myobj = new Company();
       System.out.println("company Name is: "+myobj.getcompany_name());
       System.out.println("address is: "+myobj.getaddress());
       System.out.println("number of brach  is: "+myobj.getnumber_of_branches());

       //parameterized
        
       Company myobj2 = new Company( "HCL" ,1225 , 1);
       System.out.println("Company Name is: "+myobj2.getcompany_name());
       System.out.println("address is: "+myobj2.getaddress());
       System.out.println("number of branches is: "+myobj2.getnumber_of_branches()); 
  }
}