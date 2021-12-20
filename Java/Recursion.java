class Recursion
{
	static void test1(String name){
           
           if( name== null ||name.length()<=1){
           	System.out.print(name);
           }else{

              System.out.print(name.charAt(name.length()-1));
              test1(name.substring(0,name.length()-1));

           }
	}
	public static void main(String[] args) {
		String name = "Harsh";
		test1(name);
	}
}