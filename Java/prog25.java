public class prog25 {
 

    // public static void main(String[] args) {
    //     System.out.println("this program calling exception");
    //     age(Integer.parseInt(args[0]));
    // }

    
        static void age (int i){
            if(i<18){
                throw new ArithmeticException("not the age for voting");
            }else{
                System.out.println("valid to vote");
            }
        }
    

    public static void main(String[] args) {
       System.out.println("this is a Exception");
        try{
            age(Integer.parseInt(args[0]));
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
  
}
