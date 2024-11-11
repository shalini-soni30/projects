package MyPack;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MySuccess
 */
@WebServlet("/MySuccess")
public class MySuccess extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String product = request.getParameter("product");
		 String myonePrice = request.getParameter("price");
		response.setContentType("text/html");
		response.getWriter().println("<html><body>");
		response.getWriter().println("<h1>Payment Successful<h1>");
		response.getWriter().println("<p>Your payment for the produc: "+product+"&price="+myonePrice+"was successful</p>");
		response.getWriter().println("</body></html>");
	}

}
