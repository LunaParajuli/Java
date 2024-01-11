
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HyperLinkDemo extends HttpServlet
{
    String msg="";
    PrintWriter out;
    
    public void init(ServletConfig config)throws ServletException
    {
        msg="Hello World!My first servlet program";
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws
            ServletException,IOException
    {
        response.setContentType("text/html");
        out=response.getWriter();
        out.println("<h1>"+msg+"</h>");
    }
    public void destroy()
    {
        out.close();
    }
}