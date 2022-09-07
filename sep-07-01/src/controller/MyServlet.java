package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
//		out.println("Hi the servlet is being called");
		//get inputs from the form. So use "request" object
		int no1=Integer.parseInt(request.getParameter("txtNo1"));
		int no2=Integer.parseInt(request.getParameter("txtNo2"));
		int sum=no1+no2;
		response.setContentType("text/html");
		out.println("<form method=\"post\" action=\"MyServlet\">\r\n" + 
				"Number 1: <input type=\"number\" name=\"txtNo1\" value="
				+no1
				+ " /><br/>\r\n" + 
				"Number 2: <input type=\"number\" name=\"txtNo2\" value="
				+no2
				+ " /><br/>\r\n" + 
				"<input type=\"submit\" />\r\n" + 
				"\r\n" + 
				"</form>");
		out.print(sum);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		session.invalidate(); 			//signout/ logout
		//we can keep lot of info inside the session object
		doGet(request, response);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroyed");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Inited");
	}

}
