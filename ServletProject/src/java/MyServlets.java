
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class MyServlets extends HttpServlet 
{ 
    String msg="";
    PrintWriter out;
    public void init() throws ServletException
    { 
        msg="Hello World: My first servlet program";    
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            				throws ServletException,IOException    
    {
        response.setContentType("text/html");
        out=response.getWriter();
        out.println(msg);
    }
    public void destroy()
    {  
        out.close();
    }
}
