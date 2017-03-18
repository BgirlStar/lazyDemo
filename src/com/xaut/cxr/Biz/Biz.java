package com.xaut.cxr.Biz;

import java.util.List;

import com.xaut.cxr.entity.Msg;

public interface Biz {
  public List<Msg> query1();
  public boolean insert(Msg msg);
}
