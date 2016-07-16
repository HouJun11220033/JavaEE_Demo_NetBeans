///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.listenerTest;
//
//import java.sql.*;
//import javax.servlet.*;
//import javax.servlet.annotation.*;
//
//@WebListener
//public class GetConnListener implements ServletContextListener {
//
//    @Override
//    public void contextInitialized(ServletContextEvent sce) {
//
//        try {
//            ServletContext application = sce.getServletContext();
//            String driver =  application.getInitParameter("driver");
//            String url =  application.getInitParameter("url");
//            String username =  application.getInitParameter("username");
//            String pass =  application.getInitParameter("pass");
//            Class.forName(driver);
//            Connection conn = DriverManager.getConnection(url, username, pass);
//            application.setAttribute("conn", conn);//很关键的一步骤，setAttribute("name",value);
//
//        } catch (ClassNotFoundException | SQLException ex) {
//            //  Logger.getLogger(GetConnListener.class.getName()).log(Level.SEVERE, null, ex);
//            ex.getMessage();
//
//        }
//
//    }
//
//    @Override
//    public void contextDestroyed(ServletContextEvent sce) {
//        ServletContext application = sce.getServletContext();
//        Connection conn = (Connection) application.getAttribute("conn");
//        if (conn != null) {
//            try {
//                conn.close();
//            } catch (SQLException ex) {
//                ex.getMessage();
//            }
//
//        }
//
//    }
//
//}
package com.listenerTest;

import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@WebListener
public class GetConnListener implements ServletContextListener
{
	// 应该启动时，该方法被调用。
        @Override
	public void contextInitialized(ServletContextEvent sce)
	{
		try
		{
			// 取得该应用的ServletContext实例
			ServletContext application = sce.getServletContext();
			// 从配置参数中获取驱动
			String driver = application.getInitParameter("driver");
			// 从配置参数中获取数据库url
			String url = application.getInitParameter("url");
			// 从配置参数中获取用户名
			String user = application.getInitParameter("user");
			// 从配置参数中获取密码
			String pass = application.getInitParameter("pass");
			// 注册驱动
			Class.forName(driver);
			// 获取数据库连接
			Connection conn = DriverManager.getConnection(url
				, user , pass);
			// 将数据库连接设置成application范围内的属性
			application.setAttribute("conn" , conn);
		}
              //  build-impl:1048错误的问题出在这里：catch (ClassNotFoundException | SQLException ex)！！！
		catch (Exception ex)
		{
			System.out.println("Listener中获取数据库连接出现异常"
				+ ex.getMessage());
		}
	}
	// 应该关闭时，该方法被调用。
        @Override
	public void contextDestroyed(ServletContextEvent sce)
	{
		// 取得该应用的ServletContext实例
		ServletContext application = sce.getServletContext();
		Connection conn = (Connection)application.getAttribute("conn");
		// 关闭数据库连接
		if (conn != null)
		{
			try
			{
				conn.close();
			}
			catch (SQLException ex)
			{
			}
		}
	}
}
