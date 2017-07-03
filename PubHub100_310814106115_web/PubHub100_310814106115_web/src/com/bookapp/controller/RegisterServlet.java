package com.bookapp.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookapp.dao.UserDAO;
import com.bookapp.model.User;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String email_id = request.getParameter("email_id");
		String password = request.getParameter("password");
		User user = new User();
		user.setName(name);
		user.setEmail_id(email_id);
		user.setPassword(password);
		UserDAO dao = new UserDAO();
		try {
			dao.register(user);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	doGet(request,response);
		String name = request.getParameter("name");
		String email_id = request.getParameter("email_id");
		String password = request.getParameter("password");
		User user = new User();
		user.setName(name);
		user.setEmail_id(email_id);
		user.setPassword(password);
		UserDAO dao = new UserDAO();
		try {
			dao.register(user);
			response.sendRedirect("login.jsp");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
