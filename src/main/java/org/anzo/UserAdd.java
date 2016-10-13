package org.anzo;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class UserAdd extends HttpServlet {

    public static String name;
    public static String password;



        @Override
        protected void doGet (HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {

             name = req.getParameter("name");
             password = req.getParameter("password");

            String result =  name + " - Вы успешно зарегистрировались ! ";
            req.setAttribute("test", result );
            req.getRequestDispatcher("success.jsp").forward(req , resp);


        }
    }
