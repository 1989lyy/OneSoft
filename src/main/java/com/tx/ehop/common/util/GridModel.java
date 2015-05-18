package com.tx.ehop.common.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @param <T>
 * 分页工具
 */
public class GridModel {
//	传递到页面的数据
	private List rows=new ArrayList();
//	总记录数
	private long total = 0L;
	
	public List getRows() {
		return rows;
	}
	public void setRows(List rows) {
		this.rows = rows;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
}