package org.anzo;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataBase {


    public List baseName = selectName();
    public List basePass = selectPass();


    private Connection connection;


    public Connection getConnection() throws ClassNotFoundException, SQLException {

        if (this.connection == null) {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://mysql303.1gb.ua/gbua_anzo", "gbua_anzo", "d19fac7cvnm");
        }
        return connection;
    }


    public List selectName() {

        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultset = statement.executeQuery(
                    "SELECT * FROM users "

            );


            List<String> s = new ArrayList<String>();
            while (resultset.next()) {
                s.add(resultset.getString(2)) ;

            }

            return s;
        } catch (Exception e) {
            return null;
        }
    }


    public List selectPass() {

        try {


            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultset = statement.executeQuery(
                    "SELECT * FROM users "

            );


            List i = new ArrayList();

            while (resultset.next()) {
                i.add(resultset.getString(1));


            }
            return i;
        } catch (Exception e) {
            return null;
        }
    }

}
