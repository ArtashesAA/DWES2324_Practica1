package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Area
 */
public class Area extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public Area() {
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

		String base = request.getParameter("base");
		String altura = request.getParameter("altura");

		try {
			Integer n1 = Integer.parseInt(base);
			Integer n2 = Integer.parseInt(altura);
			Integer area = n1 * n2;
			out.println("<html>");
			out.println("<head><title>Resultado de la suma</title></head>");
			out.println("<body>");
			out.println("<h1>Area del rectangulo</h1>");
			out.println("<p>El area del rectángulo es: </p>" + area);
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String base = request.getParameter("base");
		String altura = request.getParameter("altura");

		Integer n1 = Integer.parseInt(base);
		Integer n2 = Integer.parseInt(altura);
		Integer area = n1 * n2;

		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Resultado de la suma:</h1>");
		out.println("El area del rectángulo es: " + area);
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
