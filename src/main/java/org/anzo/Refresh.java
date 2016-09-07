package org.anzo;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;


public class Refresh extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



//            // Set refresh, autoload time as 5 seconds
           resp.setIntHeader("Refresh", 5);

//
//            // Set response content type
           resp.setContentType("text/html");

            // Get current time
            Calendar calendar = new GregorianCalendar();
            String am_pm;
            int hour = calendar.get(Calendar.HOUR);
            int minute = calendar.get(Calendar.MINUTE);
            int second = calendar.get(Calendar.SECOND);
            if (calendar.get(Calendar.AM_PM) == 0)
                am_pm = "AM";
            else
                am_pm = "PM";

            String CT = hour + ":" + minute + ":" + second + " " + am_pm;

            req.setAttribute("test", CT );
            req.getRequestDispatcher("calendar.jsp").forward(req , resp);
    }
}
