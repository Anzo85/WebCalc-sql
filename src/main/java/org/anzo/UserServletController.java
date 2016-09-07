package org.anzo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by andreyz on 04.09.16.
 */
public class UserServletController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("name" , "Andrey");
        req.getRequestDispatcher("test.jsp").forward(req ,resp);
    }
}
