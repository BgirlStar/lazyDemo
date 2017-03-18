package com.xaut.cxr.comm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.xaut.cxr.entity.Msg;

public class BaseDao {
//数据库连接

	private Connection conn;
	private ResultSet rs;
	private PreparedStatement ps;

	// 创建数据库连接
	public Connection getConn() {
		try {
			// 反射创建对象
			Class.forName("com.mysql.jdbc.Driver");
			// 创建连接
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/star?user=root&password=123&useUnicode=true&characterEncoding=utf-8");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("数据库连接成功:"+conn);
		return conn;
	}

	//添加修改
	public int UI(String sql,Msg msg) {
		int row = 0;
		getConn();
		try {
			// 语句声明
			ps = conn.prepareStatement(sql);
			ps.setString(1,msg.getNum());
			ps.setString(2,msg.getName());
			ps.setString(3,msg.getId());
			ps.setString(4,msg.getPwd());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
				row = ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return row;
	}
		//查询
	public ResultSet query(String sql) {
		try {
			getConn();
			Statement s = conn.createStatement();
			rs = s.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
}
