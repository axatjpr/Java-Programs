class Thisdemo{

	public Thisdemo(){
		this(10);
		System.out.println("First Constructor");

	}
	public Thisdemo(int a){
		this(10,20);
		System.out.println("Second Constructor");
	}

	public Thisdemo(int a,int b){
		this("javaprogram");
		System.out.println("third Constructor");
	}


	public Thisdemo(String s){
		System.out.println("fourth Constructor");
	}

	public static void main(String[] args) {
		Thisdemo d1= new Thisdemo();
	}
}
