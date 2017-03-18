package com.xaut.cxr.DaoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xaut.cxr.Dao.Dao;
import com.xaut.cxr.comm.BaseDao;
import com.xaut.cxr.entity.Msg;

public class DaoImpl extends BaseDao implements Dao {

	@Override
	public List<Msg> query1() {
		String sql = "select * from msg";		
		ResultSet rs = query(sql);
		List<Msg> list=new ArrayList<Msg>();
		try {
			while (rs.next()) {
				System.out.println(rs.getString(1));
				Msg msg  = new Msg();
				msg.setNum(rs.getString("NUM"));
				msg.setName(rs.getString("NAME"));
				msg.setId(rs.getString("ID"));
				msg.setPwd(rs.getString("PWD"));
				list.add(msg);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean insert(Msg msg) {
		String sql = "insert  into msg(num,name,id,pwd) values (?,?,?,?)";
		//Object [] obj = {msg.getNum(),msg.getName(),msg.getId(),msg.getPwd()};
		return UI(sql,msg)>0;
	}

}
