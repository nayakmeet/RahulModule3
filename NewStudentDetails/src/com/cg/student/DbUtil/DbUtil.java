package com.cg.student.DbUtil;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class DbUtil {
static Connection conn=null;
public static Connection getConnection()
{
	try{
		InitialContext ic=new InitialContext();
		DataSource ds=(DataSource)ic.lookup("java:/jdbc/OracleDS");
		conn=ds.getConnection();
	}
	catch(SQLException e)
	{
		
	}
	catch(NamingException e)
	{
		
	}
	return conn;
}


}
