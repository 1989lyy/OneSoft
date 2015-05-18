package com.tx.ehop.common.util;
/**
 * @author Administrator
 * 返回json数据的封装
 * 默认标识位返回true
 */
public class CommResult {
	
	private boolean flag = true;
	private String msg = "";
	private Object obj = null;
	
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	
}