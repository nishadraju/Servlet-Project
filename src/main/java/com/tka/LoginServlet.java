package com.tka;

import java.io.IOException;
import java.util.ArrayList;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 public LoginServlet() {
		 
		 System.err.println("i am constructor");
		 
	 }
	
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	
	@Override
	public void init() throws ServletException {
		System.err.println(" i am init");
	}
	
   // public LoginServlet() {
     //   super();
        // TODO Auto-generated constructor stub
    //}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("I am In get");
		
		System.out.println(request.getParameter("username"));
		System.out.println(request.getParameter("password"));
		
		String uname=request.getParameter("username");
		String password=request.getParameter("password");
		
		if(password.equals("admin")) {
			ArrayList<String> al =new ArrayList<String>();
			al.add("xx");
			al.add("xx");
			al.add("xx");
			al.add("xx");
			al.add("xx");
			
		   //request.setAttribute("msg","<font color=\"green\">valid password");
			request.setAttribute("data",al);
			
			RequestDispatcher rd= request.getRequestDispatcher("thankyou.jsp");
			rd.forward(request, response);
		
		}else {
			
			request.setAttribute("msg","<font color=\"red\">Invalid password");
			RequestDispatcher rd= request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
			
			
		}
		
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		System.out.println("I am In post");
	}

	@Override
	public void destroy() {
		System.out.println("i am distroy method ");
	}
}
