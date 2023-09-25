package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Tiempo
 */
public class Tabla extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public Tabla() {
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

		String num = request.getParameter("num");

		try {
			int n = Integer.parseInt(num);

			if (n >= 1 && n <= 10) {
				out.println("<html>");
				out.println("<head><title>Tabla de Multiplicar</title></head>");
				out.println("<body>");
				out.println("<h1>Tabla de multiplicar del " + n + "</h1>");
				for (int i = 1; i <= 10; i++) {
					out.println("<tr><td>" + n + " x " + i + " = </td><td>" + (n * i) + "</td></tr>");
					out.println("<br>");
				}
				out.println("</table>");
				out.println("</body>");
				out.println("</html>");
			} else {
				out.println("<html>");
				out.println("<head><h1>Error</h1></head>");
				out.println("</html>");
			}
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
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
