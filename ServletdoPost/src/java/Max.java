
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Max extends HttpServlet {
      public void doPost(HttpServletRequest request, HttpServletResponse response)
              throws ServletException, IOException
      {
          int n1=0; 
          int n2=0;
          response.setContentType("text/html");
          PrintWriter out = response.getWriter();
          n1=Integer.parseInt(request.getParameter("no1"));
          n2=Integer.parseInt(request.getParameter("no2"));
          
          if(n1>n2)
              out.println("n1="+n1+" is max number");
          else if(n2==n1)
              out.println("n2="+n2+" is amx number");
          else if (n1==n2)
              out.println("n1= "+n1+" and n2"+n2+" are equal number");
          
      }
}
