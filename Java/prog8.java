import java.util.Scanner;

class prog8
{
	public void call(int roll,String name){
		int rno = roll;
		String n = name;
		System.out.println("the guy with the name "+n+" and the roll number: "+rno);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int roll = sc.nextInt();
		String name = sc.next();
		prog8 obj = new prog8();
		obj.call(roll,name);
	}
}