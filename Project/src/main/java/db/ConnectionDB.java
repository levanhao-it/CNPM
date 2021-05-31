package db;

import java.sql.*;

public class ConnectionDB {
    static Connection con;
    public static Statement connect() throws SQLException, ClassNotFoundException {
        if (con==null||con.isClosed()){
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/cnpm?useUnicode=true&characterEncoding=utf-8","root","");
            return con.createStatement();
        }
        else {
            return con.createStatement();
        }

    }
    public void thucThiSQL(String sql){

    }
    public static PreparedStatement connect(String sql) throws SQLException, ClassNotFoundException {
        if (con==null||con.isClosed()){
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/cnpm?useUnicode=true&characterEncoding=utf-8","root","");
            return con.prepareStatement(sql);
        }
        else {
            return con.prepareStatement(sql);
        }

    }
    public static void main(String[] args) throws SQLException, ClassNotFoundException {



    }
}
