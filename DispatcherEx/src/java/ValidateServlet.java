
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValidateServlet extends HttpServlet
{
    public void doPost(HttpServletRequest request,HttpServletResponse response)
            throws ServletException,IOException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        RequestDispatcher rd;
        String login=request.getParameter("login");
        String pwd=request.getParameter("pwd");
       
        if(login.equals("java")&&pwd.equals("servlet"))
        {
            rd=request.getRequestDispatcher("FwdDemo01");
            rd.forward(request, response);
        }
        else
        {
            out.println("<p><h1>Incorrect Login Id/Password</h1></p>");
            rd=request.getRequestDispatcher("/index.html");
            rd.include(request, response);
        }
        
    }
}