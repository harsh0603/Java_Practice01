class Var_Args
{
	 static int sum(int x,int ...arr){
	 	int result = x;
	 	for(int a: arr){
	 		result += a;
	 	}
	 	return result;
	 }
	 public static void main(String[] args) {
	 	System.out.println("the result is: "+sum(4,7,5,9,4));
	 }
}