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
                    con.prepareStatement("insert into user(login, name, password)  values(?,?,?)");
            ps.setString(1, user.getLogin());
            ps.setString(2, user.getName());
            ps.setString(3, user.getPassword());

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }




}
