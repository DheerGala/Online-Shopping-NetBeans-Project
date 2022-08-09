import java.io.*;
import java.util.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CheckLogin extends HttpServlet
{
    public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        Connection con=null;
        ArrayList<String> username=new ArrayList<String>();
        ArrayList<String> password=new ArrayList<String>();
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject?autoReconnect=true&useSSL=false","root","1224");
            Statement smt=con.createStatement();
            String lname=req.getParameter("txtUser");
            String lpass=req.getParameter("txtPass");
            String select="select * from merch where UserName='"+lname+"' and Password='"+lpass+"';";
            ResultSet rs=smt.executeQuery(select);
            int checker=0;
            String n=null,mobile=null,email=null,location=null;
            while(rs.next())
            {
                checker=checker+1;
                n=rs.getString(1);
                location=rs.getString(2);
                mobile=rs.getString(3);
                email=rs.getString(4);
            }
            if(checker>0) 
            {
                HttpSession nam=req.getSession();
                nam.setAttribute("N",n);
                nam.setAttribute("mob",mobile);
                nam.setAttribute("em",email);
                nam.setAttribute("loc",location);
                RequestDispatcher rd=req.getRequestDispatcher("home.jsp");
                rd.forward(req, res);
            }
            else
            {
                RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
                pw.println("Invalid username or password");
                rd.include(req, res);
             }
            con.close();
        }
        catch(Exception e)
        {
            pw.println(e);
        }
    }
}
