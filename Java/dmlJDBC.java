import java.sql.*;






// Insert a new row----->





// public class dmlJDBC {
//     public static void main(String[] args) throws Exception {
//         Class.forName("org.sqlite.JDBC");
//         Connection con = DriverManager.getConnection("jdbc:sqlite:C://SQLlite//univ.db");
//         Statement st = con.createStatement();
//         st.executeUpdate("insert into dept values(60,'BCA')");
       
//         st.close();  
//         con.close(); 
//     }
// }








// This for update a row---->








// public class dmlJDBC {
//     public static void main(String[] args) throws Exception {
//         Class.forName("org.sqlite.JDBC");
//         Connection con = DriverManager.getConnection("jdbc:sqlite:C://SQLlite//univ.db");
//         Statement st = con.createStatement();
//         st.executeUpdate("delete from dept where deptno>=60 ");
       
//         st.close();  
//         con.close(); 
//     }
// }
    










// this for inserting using Prepare Statement------------->










import java.util.Scanner;

public class dmlJDBC {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:C://SQLlite//univ.db");
        PreparedStatement st = con.prepareStatement("insert into students values(?,?,?,?)");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the student Data: ");

        int ro = sc.nextInt();
        String na = sc.next();
        String ct = sc.next();
        int dt = sc.nextInt();
        st.setInt(1, ro);
        st.setString(2, na);
        st.setString(3, ct);
        st.setInt(4, dt);
       
        st.executeUpdate();
        
        st.close();  
        con.close(); 
        sc.close();
    }
}