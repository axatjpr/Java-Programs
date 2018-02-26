class Parent{
	public Parent(){
		System.out.println("Parent Class");

	}
}

class Parent2 extends Parent{
	public Parent2(int x){
		
		System.out.println("Parent2 Class:"+x);
	}
}

class Child extends Parent2{
	public Child(){
		super(10);
		System.out.println("Child Class");

	}

	public static void main(String[] args) {
		Child c =new Child();
	}
}