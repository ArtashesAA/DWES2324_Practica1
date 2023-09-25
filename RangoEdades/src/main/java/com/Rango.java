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
public class Rango extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public Rango() {
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

		String EDAD1 = "Infante";
		String EDAD2 = "Adolescente";
		String EDAD3 = "Adulto";
		String EDAD4 = "Anciano";
		String ERROR = "Edad no válida";

		String edad = request.getParameter("edad");
		String respuesta;

		try {
			Integer num = Integer.parseInt(edad);

			if (num < 12) {
				respuesta = EDAD1;
			} else if (num >= 12 && num <= 17) {
				respuesta = EDAD2;
			} else if (num >= 18 && num <= 60) {
				respuesta = EDAD3;
			} else if (num > 60) {
				respuesta = EDAD4;
			} else {
				respuesta = ERROR;
			}

			out.println("<html>");
			out.println("<head><title>Edades</title></head>");
			out.println("<body>");
			out.println("<p>Eres un: " + respuesta + ". </p>");
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
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
