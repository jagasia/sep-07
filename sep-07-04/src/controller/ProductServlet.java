package controller;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import model.Product;
import model.ProductDao;
import model.ProductDaoImpl;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet({ "/ProductServlet", "/ps" })
@MultipartConfig
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		Integer id=Integer.parseInt(request.getParameter("id"));
		Integer id=Integer.valueOf(request.getParameter("id"));
		String name=request.getParameter("name");
//		Double price=Double.parseDouble(request.getParameter("price");
		Double price=Double.valueOf(request.getParameter("price"));
		
		
		Part part = request.getPart("pic");
		InputStream is = part.getInputStream();
		int len=is.available();
		byte [] pic=new byte[len];
		
		is.read(pic);
		
		Product product=new Product(id, name, price, pic);
		
		ProductDao pdao=new ProductDaoImpl();
		
		int no=0;
		
		try {
			no=pdao.addProduct(product);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.getWriter().print(no+" row(s) added");
		
		
	}

}
