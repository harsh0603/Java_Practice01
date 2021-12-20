

interface school{
     int num = 14;
     void time(int type);
     void date(String plate);
 }

 class student implements school{
     public void time(int type){
         System.out.println("this is the time of the school: "+type);
     }
     public void date(String plate){
         System.out.println("this is the date for the school: "+plate);
     }
 }
public class prog17 {
   public static void main(String[] args) {
       
       student obj = new student();
       obj.time(10);
   
       obj.date("monday");
      
      System.out.println("the interger in the interface: "+obj.num); 
    }
    

}
