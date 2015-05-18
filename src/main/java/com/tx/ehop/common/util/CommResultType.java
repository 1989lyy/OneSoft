package com.tx.ehop.common.util;

import org.apache.struts2.json.JSONResult;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.util.ValueStack;

/**
 * @author admin
 * 自定义的返回JsonResult的结果转json
 */
public class CommResultType extends JSONResult {
	private static final long serialVersionUID = 1L;
	@Override
	protected Object findRootObject(ActionInvocation invocation) {
		ValueStack stack = invocation.getStack();
        Object rootObject = stack.findValue("commResult");
        return rootObject;
	}
}
