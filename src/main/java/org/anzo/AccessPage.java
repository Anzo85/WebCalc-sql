package org.anzo;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class AccessPage extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String password = req.getParameter("password");

        DataBase base = new DataBase();

        if(isName(name,base) && isPass(password,base)){
            resp.sendRedirect("index.jsp");
        }

        else {
            resp.sendRedirect("error.jsp");
        }

    }


    public static boolean isName(String name, DataBase base) {

        for (Object n : base.baseName) {


            if (name.equals(n)) {
                return true;
            }

        }

        return false;

    }


    public static boolean isPass(String name, DataBase base) {

        for (Object n : base.basePass) {


            if (name.equals(n)) {
                return true;
            }

        }

        return false;

    }
}
