package com.kim.sep142.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Calculator")
public class Calculator extends HttpServlet {

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("EUC-KR");
		int a = Integer.parseInt(request.getParameter("x"));
		int b = Integer.parseInt(request.getParameter("y"));
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title>hi</title><meta charset='EUC-KR'></head>");
		out.print("<body>");

		out.print("<h1>��Ģ����</h1>");
		out.print("<table border='1'>");
		out.printf("<tr><td>%d + %d = %d</td></tr>",a,b,a+b);
		out.printf("<tr><td>%d - %d = %d</td></tr>",a,b,a-b);
		out.printf("<tr><td>%d * %d = %d</td></tr>",a,b,a*b);
		out.printf("<tr><td>%d / %d = %.2f</td></tr>",a,b,a/(double) b);
		
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
