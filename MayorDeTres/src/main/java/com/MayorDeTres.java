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
public class MayorDeTres extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MayorDeTres() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		String num3 = request.getParameter("num3");

		try {
			Integer n1 = Integer.parseInt(num1);
			Integer n2 = Integer.parseInt(num2);
			Integer n3 = Integer.parseInt(num3);
			
			Integer mayor;
			
			if(n1>n2 && n1>n3) {
				mayor=n1;
			}else if(n2>n1 && n2>n3){
				mayor=n2;
			}else {
				mayor=n3;
			}
			
			out.println("<html>");
			out.println("<head><title>Mayor de Tres</title></head>");
			out.println("<body>");
			out.println("<p>El mayor de tres es: " + mayor + ". </p>");
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
