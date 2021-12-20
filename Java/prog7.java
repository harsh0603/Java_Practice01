class prog7
{
	public static void main(String[] args) {
     outer: for(int i=0;i<=3;i++){
      inner:	for(int j=0;j<=i;j++){
      		if(i==1) continue outer;
      		System.out.print("*");
          
    
   }
      System.out.println();
  }
 }
}