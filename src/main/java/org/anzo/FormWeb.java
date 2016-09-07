package org.anzo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class FormWeb extends HttpServlet {



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String param1 = (String) request.getParameter("x");
        int  x = Integer.parseInt(param1);
        String param2 = (String) request.getParameter("y");
        int y  = Integer.parseInt(param2);
        int z=0 ;
        String operation = (String) request.getParameter("op");
        if (operation.equals("+")){
             z = x+y;
        }
        else if (operation.equals("-")){
            z = x-y;
        }
        else if (operation.equals("*")){
            z=x*y;
        }
        else if (operation.equals("/")) {
            z = x / y;
        }
        else {
            z = 000;
        }
        String result = "Result: " + z;
        response.getWriter().println("<!DOCTYPE HTML>");
        response.getWriter().println("<html><body style= \"background-color:powderblue;\"><form action=\"http://localhost:9090/web/\"><h1> " + result + "</p></form></body></html>");
        response.getWriter().println("<input type=\"submit\"value=\"Back\" />");
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
