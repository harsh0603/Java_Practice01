
public class StringBufferExample {
   

    public static void main(String[] args) {
        String s1 = "Sharma";
        StringBuffer sb=new StringBuffer("Hello ");  
        sb.append("Java");//now original string is changed  
        System.out.println(sb);
        System.out.println(sb.insert(1, "To All "));
        System.out.println(sb.replace(1, 3, "Harsh"));
        System.out.println(sb.delete(0,8));
        System.out.println(sb.replace(0,7,"Hello"));


    }
}
