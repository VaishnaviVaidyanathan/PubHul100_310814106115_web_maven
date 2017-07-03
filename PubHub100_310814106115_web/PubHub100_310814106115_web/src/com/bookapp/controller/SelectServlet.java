package com.bookapp.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookapp.dao.BookDAO;
import com.bookapp.model.Book;



@WebServlet("/SelectServlet")
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SelectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		Book book = new Book();
		book.setName(name);
		
		
		BookDAO dao = new BookDAO();
		try {
			List<Book> books = dao.findByName(book);
			System.out.println(books.size());
			if (books.size() > 0) {
				RequestDispatcher rd = request.getRequestDispatcher("select.jsp");
				request.setAttribute("books", books);
				rd.forward(request, response);
			} else {
				response.sendRedirect("home.jsp");

			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	
	

}
