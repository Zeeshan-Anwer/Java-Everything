package com.trainbooking.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.train.booking.htmlutil.HtmlUtil;

/**
 * Servlet implementation class Index
 */
@WebServlet("/Index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Index() {
        super();
        // TODO Auto-generated constructor stub
    }

@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	PrintWriter out= resp.getWriter();
	String p=HtmlUtil.converter("D:\\Workspace\\WebApp\\src\\main\\webapp\\index.html");
    out.print(p);

}
}
