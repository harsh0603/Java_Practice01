class MyException extends Exception{
    public String getMessage(){
        return "Radius can't be negative";
    }
}

public class prog26 {
   
   public static double caculate(int a) throws MyException{
                if(a<0){
                    throw new MyException();
                }
           double result = Math.PI*a*a;  
           return result;   
   }
    public static void main(String[] args) {
        try{
            System.out.println("tyhis is the result"+caculate(-4)); 

        }
        catch(Exception e){
            System.out.println("Exception "+e);
        }
    }
}
