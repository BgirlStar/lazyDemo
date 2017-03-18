package com.xaut.cxr.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.xaut.cxr.BizImpl.BizImpl;
import com.xaut.cxr.entity.Msg;

/**
 * Servlet implementation class Log
 */
@WebServlet("/Log")
public class Log extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Log() {
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
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		System.out.println("进入dopost1");
		BizImpl bi = new BizImpl();
		PrintWriter out =resp.getWriter();
		List<Msg> list= bi.query1();
		String id = req.getParameter("id");
		String pwd= req.getParameter("pwd");
		boolean index=false;
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			if(id.equals(list.get(i).getId())){
				if(pwd.equals(list.get(i).getPwd())){
					System.out.println("重定向");
					req.getRequestDispatcher("succeed.jsp").forward(req, resp);
				}else{
				out.write("请输入正确密码");
				}
			}
			else{
				index=true;
			}
		}
		if(index==true){
			System.out.println("注册");
			req.getRequestDispatcher("regist.jsp").forward(req, resp);;
		}
	
	}
}
