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
public class Divisores extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public Divisores() {
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

			if (n >= 1) {
				out.println("<html>");
				out.println("<head><title>Divisores</title></head>");
				out.println("<body>");
				out.println("<h1>Divisores de " + n + ":</h1>");

				for (int i = 1; i <= n; i++) {
					if (n % i == 0) {
						out.println("<p>" + i + "</p>");
						out.println("<br>");
					}
				}

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
