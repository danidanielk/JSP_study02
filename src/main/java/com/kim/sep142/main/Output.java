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

	//get 방식 요청파라미터 한글처리
	//	EUC-KR로 맞추자
	//	tomcat server.xml 63번줄 설정을 건드렸었기에 요청시에는 인코딩해줄필요없지만 받아올때는 해줘야한다..
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
		// Get방식 요청 vs Post 방식 요청
		//		Get : 요청파라미터가 주소에있음. 대부분 GET방식을 사용
		//		Post : 요청파라미터가 주소에없음. 프로그램 내부적으로 전달 보안성이높아서 로그인이나 회원가입용도로 사용
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


