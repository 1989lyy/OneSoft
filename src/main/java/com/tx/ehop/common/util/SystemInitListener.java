package com.tx.ehop.common.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * 静态资源地址和动态资源地址放到application变量中
 */
public class SystemInitListener implements ServletContextListener {
	private static Logger logger = LogManager.getLogger(SystemInitListener.class);

	@Override
	public void contextDestroyed(ServletContextEvent contextEvent) {
		logger.error("项目停止.....");
	}

	@Override
	public void contextInitialized(ServletContextEvent contextEvent) {
		try {
			String realPath = contextEvent.getServletContext().getContextPath();
			contextEvent.getServletContext().setAttribute("webroot", realPath);
		} catch (Exception e) {
			logger.error("项目启动.....", e);
		}
	}
}
