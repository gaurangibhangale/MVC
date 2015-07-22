package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Logindao;
import com.dao.Moviedao;
import com.model.User;
import com.sun.media.jfxmedia.logging.Logger;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Logindao ld = new Logindao();
		Moviedao md=new Moviedao();
		RequestDispatcher rd= null;
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username+"  "+password);
		
		User user= new User(username, password);
		md.addMovie();
		md.listMovies();
		boolean result=ld.authenticate(user);
		
		if(result)
		{

			System.out.println("redirecting to home");
			request.setAttribute("username", username); 
			rd=request.getRequestDispatcher("/home.jsp");
		}
		else
		{
			rd=request.getRequestDispatcher("/login.jsp");
		}
		
		rd.forward(request, response);

		
		
		
	}

}
