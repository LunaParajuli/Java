

package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      response.setContentType("text/html");
      PrintWriter out =response.getWriter();
      out.println("<!DOCTYPE html>");
      out.println("<html>");
      out.println("<body>");
      String name=request.getParameter("name");
      out.println("<h1> hello,"+name+"welcome to my website</h1>");
      out.println("<h1><a href='servlet2'>Go to servlet</a></h1>");
      Cookie c= new Cookie("username",name);
      response.addCookie(c);
      out.println("</html>");
      out.println("</body>");
            }
}
