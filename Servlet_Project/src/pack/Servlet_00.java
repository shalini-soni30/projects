package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Serv0") // this is a annotation which reduce the code we used to write in web.xml
public class Servlet_00 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("uname");
		String pass=request.getParameter("upass");
		if(name.equals("admin") && pass.equals("abc123")){
			//pw.println("Welcome to profile "+name +"<a href='UserProfile'>Profile</a> " );
			RequestDispatcher dispatcher =request.getRequestDispatcher("UserProfile");
			dispatcher.forward(request, response);
		}
		else
		{
			RequestDispatcher dispatcher =request.getRequestDispatcher("index.html");
			dispatcher.include(request, response);
			pw.println("Invalid Username Or Password " );
		}
	}

}
