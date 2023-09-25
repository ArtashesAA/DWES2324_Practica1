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
public class Tiempo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Tiempo() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String km = request.getParameter("km");
		String velocidad = request.getParameter("velocidad");

		try {
			Double n1 = Double.parseDouble(km);
			Double n2 = Double.parseDouble(velocidad);
			Double tiempo = n1 / n2;
			out.println("<html>");
			out.println("<head><title>Tiempo de viaje</title></head>");
			out.println("<body>");
			out.println("<p>Tiempo de viaje: " + tiempo + " horas.</p>");
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
