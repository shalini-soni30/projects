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
 * Servlet implementation class AddLogic
 */
/*@WebServlet("/addition")
public class AddLogic extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		int firstNumber=Integer.parseInt(request.getParameter("firstNum"));
		int secondNumber=Integer.parseInt(request.getParameter("SecondNum"));
		int sum=firstNumber+secondNumber;
		
		request.setAttribute("sum", sum);
		request.setAttribute("FirstNumber", firstNumber);
		request.setAttribute("SecondNumber", secondNumber);

		RequestDispatcher dispatcher=request.getRequestDispatcher("Average");
		dispatcher.forward(request, response);
	
	}

}*/

///////////////////Send Redirect// It is mainly used if i want to go to some other servers page
@WebServlet("/addition")
public class AddLogic extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		int firstNumber=Integer.parseInt(request.getParameter("firstNum"));
		int secondNumber=Integer.parseInt(request.getParameter("SecondNum"));
		int sum=firstNumber+secondNumber;
		
		 // Redirect to the Average servlet with the correct query parameters
        response.sendRedirect("Average?firstNum=" + firstNumber + "&secondNum=" + secondNumber +"&sum="+sum);
	}

}

