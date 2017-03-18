package com.xaut.cxr.Dao;

import java.util.List;

import com.xaut.cxr.entity.Msg;

public interface Dao {

	public List<Msg> query1();
	public boolean insert(Msg msg);
	
}
