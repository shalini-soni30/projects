package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Average
 */
@WebServlet("/Average")
public class Average extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Retrieve the sum attribute as an Integer
	/*	
		Integer Attribute1 = (Integer) request.getAttribute("FirstNumber");
		Integer Attribute2 = (Integer) request.getAttribute("SecondNumber");
		Integer sumAttribute = (Integer) request.getAttribute("sum");
		// Convert it to int (handle null case)
		int sum = (sumAttribute != null) ? sumAttribute : 0; // Default to 0 if null

		// Convert int to double
		double sum1 = (double) sumAttribute;
		double avg=sum1/2;*/
		
		
		   // Retrieve the parameters from the request
        String firstNumberParam = request.getParameter("firstNum");
        String secondNumberParam = request.getParameter("secondNum");
        String sumParam = request.getParameter("sum");

        // Parse the numbers
        int firstNumber = Integer.parseInt(firstNumberParam);
        int secondNumber = Integer.parseInt(secondNumberParam);
        int sum = Integer.parseInt(sumParam);

		double avg=sum/2;
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("<html><body>");
		pw.println("<h2>Result</h2>");
		pw.println("First Number: "+firstNumberParam+"<br>");
		pw.println("Second Number: "+secondNumberParam+"<br>");
		pw.println("Sum: "+sum+"<br>");
		pw.println("Average: "+avg+"<br>");
		pw.println("<br><a href='Calculate.html'>Go Back</a>");
		pw.println("</html></body>");

	
	}

}
