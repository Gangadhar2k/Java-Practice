package JDBC;

import java.sql.*;

public class Select_Query {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbc";
        String userName = "root";
        String password = "admin";
        String query = "select * from employees";

        try {
            // Create Connection
            Connection con = DriverManager.getConnection(url, userName, password);

            // create Statement
            Statement st = con.createStatement();

            //execute Statement
            ResultSet rs = st.executeQuery(query);

            //show result
           while (rs.next()) {

               System.out.println("Emp id " + rs.getInt(1) + "Emp Name " + rs.getString(2) + "Emp Sal " + rs.getInt(3));
           }
            //close Connection
            rs.close();
            st.close();
            con.close();

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
