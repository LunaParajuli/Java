
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet2 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      response.setContentType("text/html");
      PrintWriter out =response.getWriter();
      out.println("<!DOCTYPE html>");
      out.println("<html>");
      out.println("<body>");
      Cookie c[]=request.getCookies();
      boolean f=false;
      String name="";
      if(c==null){
      out.println("<h1>you are the new user go back to my website and login</h1>");
      }
      else{
      for(Cookie i:c){
       name=i.getName();
      if(name.equals("username")){
          f= true;
          name=i.getValue();
      }
      }
      }if(f){
      out.println("<h1> hello,"+ name +"welcome back to my website</h1>");}
      else{
           out.println("<h1>Please go back and login</h1>");
      }
      out.println("<h1> Thank you</h1>");
      out.println("</html>");
      out.println("</body>");
            }
}
