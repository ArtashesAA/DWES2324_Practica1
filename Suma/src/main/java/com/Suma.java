package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Suma
 */
public class Suma extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Suma() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");

		try {
			Integer n1 = Integer.parseInt(num1);
			Integer n2 = Integer.parseInt(num2);
			Integer suma = n1 + n2;
			out.println("<html>");
			out.println("<head><title>Resultado de la suma</title></head>");
			out.println("<body>");
			out.println("<h1>Resultado de la suma:</h1>");
			out.println("<p>" + num1 + " + " + num2 + " = " + suma + "</p>");
			out.println("</body>");
			out.println("</html>");
		} catch (NumberFormatException e) {
			out.println("<html>");
			out.println("<head><h1>Error</h1></head>");
			out.println("</html>");
		} finally {
			out.close();
		}

	}

	/**
	 * 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 * 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");

		Integer n1 = Integer.parseInt(num1);
		Integer n2 = Integer.parseInt(num2);
		Integer suma = n1 + n2;

		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Resultado de la suma:</h1>");
		out.println("<p>" + num1 + " + " + num2 + " = " + suma + "</p>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
