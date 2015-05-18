package com.tx.ehop.common.util;

import java.util.ResourceBundle;

/**
 * @author Administrator
 *	配置文件读取类
 */
public class EnvPropUtil {
	private static final String ENV_NAME = "env";
	
	private static final ResourceBundle bundle = java.util.ResourceBundle.getBundle(ENV_NAME);
	/**
	 * 通过键获取值
	 * 
	 * @param key
	 * @return
	 */
	public static final String get(String key) {
		return bundle.getString(key);
	}
	
}
