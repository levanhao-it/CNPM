package entity;

import db.ConnectionDB;
import model.Book;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class BookEntity {
    public static List<Book> getAll(){
        Statement s= null;
        try {
            List<Book> re= new LinkedList<>();
            s= ConnectionDB.connect();
            ResultSet rs=s.executeQuery("select id,publisher,nameBook,author,addDate,amount, remainAmount from book");
            while (rs.next()){
                re.add(new Book(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7)
                ));

            }
            rs.close();
            s.close();
            return re;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return new LinkedList<>();
        }

    }

    public static void deleteBook(String pid) {
        PreparedStatement ps = null;
        Book pro = new Book();
        try {

            String sql = "delete from book where id= ? ";
            ps = ConnectionDB.connect(sql);
            ps.setString(1, pid);
            ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
    }
    public static void insertBook(String id, String publisher, String nameBook, String author, String addDate, int amount, int remainAmount){
        PreparedStatement s= null;
        try {

            String sql= "INSERT INTO book (id,publisher,nameBook,author,addDate,amount,remainAmount) values(?,?,?,?,?,?,?)";
            s= ConnectionDB.connect(sql);
            s.setString(1,id);
            s.setString(2,publisher);
            s.setString(3,nameBook);
            s.setString(4,author);
            s.setString(5,addDate);
            s.setInt(6,amount);
            s.setInt(7,remainAmount);

            s.executeUpdate();

            s.close();



        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();

        }
    }
    public static void updateBook(String id, String publisher, String nameBook, String author, String addDate, int amount, int remainAmount){
        PreparedStatement s= null;
        try {

            String sql= "update book set publisher=?,nameBook=?,author=?,addDate=?,amount=?,remainAmount=? where id=?";
            s= ConnectionDB.connect(sql);

            s.setString(1,publisher);
            s.setString(2,nameBook);
            s.setString(3,author);
            s.setString(4,addDate);
            s.setInt(5,amount);
            s.setInt(6,remainAmount);
            s.setString(7,id);
            s.executeUpdate();




//            int re=s.executeUpdate(sql);
            s.close();



        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();

        }
    }
    public static List<Book> getProductById(String id) {
        PreparedStatement s= null;
        try {
            List<Book> re= new LinkedList<>();
            String sql = "SELECT * FROM book where id=?";
            s= ConnectionDB.connect(sql);
            s.setString(1,id);
            ResultSet rs=s.executeQuery();
            while (rs.next()){
                re.add(new Book(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7)));
            }
            rs.close();
            s.close();
            return re;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return new LinkedList<>();
        }
    }
    public static List<Book> getProductByName(String name) {
        PreparedStatement s= null;
        try {
            List<Book> re= new LinkedList<>();
            String sql = "SELECT * FROM book where nameBook=?";
            s= ConnectionDB.connect(sql);
            s.setString(1,name);
            ResultSet rs=s.executeQuery();
            while (rs.next()){
                re.add(new Book(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7)));
            }
            rs.close();
            s.close();
            return re;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return new LinkedList<>();
        }
    }
    public static String getIdNew(){
        Statement s= null;

        String sql = "select * from book";
        int id =0;

        try {
            s = ConnectionDB.connect();
            ResultSet rs = s.executeQuery(sql);

            while (rs.next()){
                if(Integer.parseInt(rs.getString(1)) > id)
                    id =Integer.parseInt(rs.getString(1)) ;
            }
            rs.close();
            s.close();
            String idNew = (id +1) + "";
            return idNew;
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
            return null;
        }
    }
    
}
