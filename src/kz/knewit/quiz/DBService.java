package kz.knewit.quiz;

import java.sql.*;

public class DBService {
    //CRUD =
    // CREATE READ UPDATE DELETE
    Connection con;
    Statement statement;
    public DBService()  {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizlot", "root","");
            statement = con.createStatement();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createUser(User user){
        try {

            PreparedStatement ps =
                    con.prepareStatement("insert into users(login, name, password)  values(?,?,?)");
            ps.setString(1, user.getLogin());
            ps.setString(2, user.getName());
            ps.setString(3, user.getPassword());
            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void deleteUser(User user){
        try{
            statement.executeUpdate("delete from users where id = " +user.getId());
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void updateUser(User user){
        try {

            PreparedStatement ps =
                    con.prepareStatement("update users set login = " + '?' + ", name = " + '?'+ ", password = " + '?' + " where id = " + '?');
            ps.setString(1, user.getLogin());
            ps.setString(2, user.getName());
            ps.setString(3, user.getPassword());
            ps.setInt(4, user.getId());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    //public void checkUser(User user){
    // ....                             Надо чекать есть ли такой юзер
    //}

}
