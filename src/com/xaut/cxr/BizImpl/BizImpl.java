package com.xaut.cxr.BizImpl;

import java.util.List;

import com.xaut.cxr.Biz.Biz;
import com.xaut.cxr.DaoImpl.DaoImpl;
import com.xaut.cxr.entity.Msg;

public class BizImpl extends DaoImpl implements Biz{

	@Override
	public List<Msg> query1() {
		
		return super.query1();
	}

	@Override
	public boolean insert(Msg msg) {
		
		return super.insert(msg);
	}

	
}
