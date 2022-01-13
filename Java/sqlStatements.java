// This is PreparedStatement..............................



import java.sql.*;
import java.util.Scanner;

public class sqlStatements {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:C://SQLlite//univ.db");
        PreparedStatement st = con.prepareStatement("select * from students where deptno = ?");  //Here the ? is the sign for taking input for it 

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Dept Number: ");
        int dno = sc.nextInt();
        st.setInt(1, dno);
        ResultSet rs = st.executeQuery();

        while(rs.next()){
            System.out.print(rs.getInt("roll")+" ");
            System.out.print(rs.getString("name")+" ");
            System.out.print(rs.getInt("city")+" ");
            System.out.println(rs.getInt(4)+" "); //the Index of 4th will print
            
        }
        st.close();  //this is a good exercise to do, to free memory, close statement
        con.close(); //close the connection as well
        sc.close();
    }
}




    

