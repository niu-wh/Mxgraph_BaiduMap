package com.pm.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class C3P0Util {
	//得到一个数据源
	private static ComboPooledDataSource ds = new ComboPooledDataSource();

	//获取数据源
	public static DataSource getDataSource(){
		return ds;
	}

	//从数据源中得到一个连接对象
	public static Connection getConnection(){
		try {
			System.out.println("成功连接服务器");
			return ds.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException("服务器错误");
		}
	}
	
	public static void release(Connection conn,Statement stmt,ResultSet rs){
				//关闭资源
				if(rs!=null){
					try {
						rs.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
					rs = null;
				}
				if(stmt!=null){
					try {
						stmt.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
					stmt = null;
				}
				if(conn!=null){
					try {
						conn.close();//�ر�
					} catch (Exception e) {
						e.printStackTrace();
					}
					conn = null;
				}
	}
	
}
