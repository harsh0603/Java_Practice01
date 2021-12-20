

class prog4{
	int num = 14;
	static String name = "Harsh";
	public void Instance(){
      prog4 a1 = new prog4();
      System.out.println("the instance example: "+ a1.num);
	}

	public void SecondExample(){
		prog4 a2 = new prog4();
		a2.num = 20;
		System.out.println("the static example: "+ a2.num+ " "+ a2.name);

	}

	public static void main(String[] args) {
		prog4 first = new prog4();
		first.Instance();
		System.out.println("Now the static example");
        prog4 second = new prog4();
        second.SecondExample();
	}
}