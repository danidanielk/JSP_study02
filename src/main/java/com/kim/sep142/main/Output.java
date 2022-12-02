package com.kim.sep142.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Output")
public class Output extends HttpServlet {

	//get ��� ��û�Ķ���� �ѱ�ó��
	//	EUC-KR�� ������
	//	tomcat server.xml 63���� ������ �ǵ�Ⱦ��⿡ ��û�ÿ��� ���ڵ������ʿ������ �޾ƿö��� ������Ѵ�..
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("EUC-KR");
		String a=  request.getParameter("a");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title>HI</title><meta charset='EUC-KR'></head>");
		out.print("<body>");
		out.print("<h2>Output-Get</h2>");
		out.printf("<h2>%s<h2>",a);
		out.print("</body>");
		out.print("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Get��� ��û vs Post ��� ��û
		//		Get : ��û�Ķ���Ͱ� �ּҿ�����. ��κ� GET����� ���
		//		Post : ��û�Ķ���Ͱ� �ּҿ�����. ���α׷� ���������� ���� ���ȼ��̳��Ƽ� �α����̳� ȸ�����Կ뵵�� ���
		request.setCharacterEncoding("EUC-KR");
		response.setCharacterEncoding("EUC-KR");
		String a=  request.getParameter("a");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title>HI</title><meta charset='EUC-KR'></head>");
		out.print("<body>");
		out.print("<h2>Output-POST</h2>");
		out.printf("<h2>%s<h2>",a);
		out.print("</body>");
		out.print("</html>");
	}
	}


