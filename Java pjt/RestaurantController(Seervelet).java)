package com.sastra.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sastra.bean.Restaurent;
import com.sastra.exception.DataLayerException;
import com.sastra.service.RestaurentService;

/**
 * Servlet implementation class RestaurentController
 */
public class RestaurentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RestaurentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		RestaurentService service=new RestaurentService();
		String action=request.getParameter("action");
		System.out.println("action="+action);
		RequestDispatcher rd=null;
		if("list".equals(action)) {
			try{
			ArrayList<Restaurent> alllist=service.getAllrestaurentdetails();
			rd=request.getRequestDispatcher("list.jsp");
			System.out.println("hi");
			request.setAttribute("alllist", alllist);
			rd.forward(request, response);
		
			}catch(Exception e){
				System.out.println(e);
			}
		}else if("create".equals(action)) {
			String menuid=request.getParameter("menuid");
			String menuname=request.getParameter("menuname");
			String category=request.getParameter("category");
			String type=request.getParameter("type");
			String cost=request.getParameter("cost");
			String status=request.getParameter("status");
			double cost1=0;
			if(cost!=null) {
				cost1=Double.parseDouble(cost);
			}
			Restaurent r=new Restaurent(menuid,menuname,category,type,cost1,status);
			boolean result=false;
			try {
				result = service.addmenu(r);
			} catch (DataLayerException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			if(result==true) {
				rd=request.getRequestDispatcher("success.jsp");
				request.setAttribute("message", "Menu inserted succesfully!!!");
				rd.forward(request, response);
			} else {
				rd=request.getRequestDispatcher("Failure.jsp");
				request.setAttribute("message", "Menu insertion failed!!!");
				rd.forward(request, response);
			}
		}else if("delete".equalsIgnoreCase(action)){
			String menuid=request.getParameter("menuid");
			boolean result = false;
			try {
				result = service.deletemenu(menuid);
				} catch (DataLayerException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			if(result==true){
				rd=request.getRequestDispatcher("success.jsp");
				request.setAttribute("message", "Menu deleted succesfully!!!");
				rd.forward(request, response);
			}
			else{
				rd=request.getRequestDispatcher("Failure.jsp");
				request.setAttribute("message", "Menu deleted failed!!!");
				rd.forward(request, response);
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
