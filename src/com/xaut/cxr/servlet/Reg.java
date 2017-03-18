package com.xaut.cxr.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xaut.cxr.BizImpl.BizImpl;
import com.xaut.cxr.entity.Msg;

/**
 * Servlet implementation class Reg
 */
@WebServlet("/Reg")
public class Reg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Reg() {
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
		BizImpl bi = new BizImpl();
		Msg msg = new Msg();
		String num = req.getParameter("num");
		String name= req.getParameter("name");
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		msg.setId(id);
		msg.setName(name);
		msg.setNum(num);
		msg.setPwd(pwd);
		List<Msg> list = new ArrayList<Msg>();
		list.add(msg);
		req.setAttribute("list", list);
		if(bi.insert(msg)==true){
			System.out.println(msg.getNum()+"\t"+msg.getName()+"\t"+msg.getId());
		req.getRequestDispatcher("info.jsp").forward(req, resp);
		}
	}

}
