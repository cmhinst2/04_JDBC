package edu.kh.todoList.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/todo/complete")
public class CompleteServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 전달 받은 파라미터 얻어오기
		int todoNo = Integer.parseInt( req.getParameter("todoNo") );
		
		
		
		
		
		
		
		
		
		
	}
}
