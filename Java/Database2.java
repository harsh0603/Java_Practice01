import java.sql.*;

public class Database2 {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:C://SQLlite//univ.db");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from students");

        while(rs.next()){
            System.out.print(rs.getInt("roll")+" ");
            System.out.print(rs.getString("name")+" ");
            System.out.print(rs.getInt("city")+" ");
            System.out.println(rs.getInt(4)+" "); //the Index of 4th will print
            System.out.println();
        }
        st.close();  //this is a good exercise to do, to free memory, close statement
        con.close(); //close the connection as well
    }
}
