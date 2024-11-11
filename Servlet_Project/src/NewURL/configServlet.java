package NewURL;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class configServlet
 */
@WebServlet("/configServlet")
public class configServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter pw=response.getWriter();
	pw.println("In a world of fully constant change, adaptability is fully key. "
			+ "Embrace challenges as opportunities for fully growth, "
			+ "fostering resilience and innovation. Collaboration amplifies success; "
			+ "diverse perspectives drive creativity. Remember, every line of code is a "
			+ "step towards a solution. Pursue knowledge relentlessly, and let curiosity"
			+ " guide your journey. ");
	}

}
