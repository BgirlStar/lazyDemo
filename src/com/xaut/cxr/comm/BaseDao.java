package com.xaut.cxr.comm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.xaut.cxr.entity.Msg;

public class BaseDao {
//���ݿ�����

	private Connection conn;
	private ResultSet rs;
	private PreparedStatement ps;

	// �������ݿ�����
	public Connection getConn() {
		try {
			// ���䴴������
			Class.forName("com.mysql.jdbc.Driver");
			// ��������
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/star?user=root&password=123&useUnicode=true&characterEncoding=utf-8");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("���ݿ����ӳɹ�:"+conn);
		return conn;
	}

	//����޸�
	public int UI(String sql,Msg msg) {
		int row = 0;
		getConn();
		try {
			// �������
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
		//��ѯ
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
