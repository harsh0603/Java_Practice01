import java.util.Scanner;

class prog5{
	public void Autoboxing(){
		int i =45;
		Integer obj = Integer.valueOf(i);
		Integer obj1 = i;
		System.out.println("the sum is: "+(obj+obj1));
	}

	public void Unboxing(){
		Integer obj2 = new Integer(15);
		int k = obj2.intValue();
		System.out.println("the value is : "+k);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  int j = sc.nextInt();

		if(j==1){
			prog5 first = new prog5();
			first.Autoboxing();
		}

		if(j==2){
			prog5 second = new prog5();
			second.Unboxing();
		}

	
		
	}
}