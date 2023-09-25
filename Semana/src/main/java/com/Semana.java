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
public class Semana extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public Semana() {
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

		String DIA1 = "Lunes";
		String DIA2 = "Martes";
		String DIA3 = "Miércoles";
		String DIA4 = "Jueves";
		String DIA5 = "Viernes";
		String DIA6 = "Sabado";
		String DIA7 = "Domingo";
		String ERROR = "ERROR";

		String dia = request.getParameter("dia");
		String respuesta;

		try {
			Integer num = Integer.parseInt(dia);

			if (num == 1) {
				respuesta = DIA1;
			} else if (num == 2) {
				respuesta = DIA2;
			} else if (num == 3) {
				respuesta = DIA3;
			} else if (num == 4) {
				respuesta = DIA4;
			} else if (num == 5) {
				respuesta = DIA5;
			} else if (num == 6) {
				respuesta = DIA6;
			} else if (num == 7) {
				respuesta = DIA7;
			} else {
				respuesta = ERROR;
			}

			out.println("<html>");
			out.println("<head><title>Semana</title></head>");
			out.println("<body>");
			out.println("<p>El dia de la semana es: " + respuesta + ". </p>");
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
