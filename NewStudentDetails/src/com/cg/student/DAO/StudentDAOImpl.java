package com.cg.student.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.cg.bean.StudentInfo;
import com.cg.student.DbUtil.DbUtil;


public class StudentDAOImpl implements IStudentDAO{
	Connection conn=null;
public int insert(StudentInfo bean){
		
		int row=0;
		int value=0;
		try{
			conn=DbUtil.getConnection();
			PreparedStatement ps=conn.prepareStatement("insert into Student_score values(?,?,?,?,?,?,?)");
			
			ps.setInt(1,bean.getSid());
			ps.setString(2,bean.getSubname());
			ps.setInt(3,bean.getTheory());
			ps.setInt(4,bean.getPrac());
			ps.setInt(5,bean.getLab());
			ps.setInt(6,bean.getTotalscore());
			ps.setString(7,bean.getGrade());
			
			
			row=ps.executeUpdate();
		}
			
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return row;
}

	
		

	
	public ArrayList<Integer> retrieveId() {
		ArrayList<Integer> list=new ArrayList<Integer>();
		try
		{
		conn=DbUtil.getConnection();
		String sl="Select sid from stud";
		
		
		Statement stmt=conn.createStatement();
		
		ResultSet rs=stmt.executeQuery(sl);
		while(rs.next())
		{
			
			list.add(rs.getInt(1));
		}
		System.out.println(list);
	}
	catch(SQLException e)
	{
	
		System.out.println(e.getMessage());
	}
	return list;
	}





	
	}


