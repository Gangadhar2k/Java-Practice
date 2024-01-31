package JDBC;

import java.sql.*;


public class Insert_Query {

    public static void main(String[] args) {

        Insert_Query iq = new Insert_Query();
//        iq.InsertRecords();
//        iq.InsertByVariables();
        iq.InsertUsingPS();
    }

    public void InsertRecords()  {

        String url = "jdbc:mysql://localhost:3306/jdbc";
        String userName = "root";
        String password = "admin";
        String query = "INSERT INTO employees (emp_id, emp_name, emp_sal) VALUES (4, 'sim', 70000)";

        try {
            Connection con = DriverManager.getConnection(url, userName, password);
            Statement st = con.createStatement();
            int rows = st.executeUpdate(query);
            System.out.println("Rows affected ==" + rows);
            st.close();
            con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }

    }


    public void InsertByVariables(){
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String userName = "root";
        String password = "admin";
        int id = 5;
        String name = "Gangadhar";
        int sal = 800000;
        String query = "INSERT INTO employees (emp_id, emp_name, emp_sal) VALUES ("+id+",'"+name+"',"+sal+")";

        try {
            Connection con = DriverManager.getConnection(url, userName, password);
            Statement st = con.createStatement();
            int rows = st.executeUpdate(query);
            System.out.println("Rows affected ==" + rows);
            st.close();
            con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void InsertUsingPS(){
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String userName = "root";
        String password = "admin";
        int id = 6;
        String name = "Aravind";
        int sal = 900000;
        String query = "INSERT INTO employees (emp_id, emp_name, emp_sal) VALUES (?,?,?)";

        try {
            Connection con = DriverManager.getConnection(url, userName, password);
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,id);
            ps.setString(2,name);
            ps.setInt(3,sal);
            int Row = ps.executeUpdate();
            System.out.println("Affected rows ===="+Row);
            ps.close();
            con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
