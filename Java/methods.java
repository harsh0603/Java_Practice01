class methods
{
	static int sum(int a,int b){
		return(a+b);
	}
	static void name(){
		System.out.println("My name is harsh and this is the first method");
	}
		static void name(int a){
		System.out.println("My name is harsh and this is the first method "+a);
	}


	public static void main(String[] args) {
		// int c = sum(4,8);
		// System.out.println(c);
	
        name();
        name(40);
	}
}