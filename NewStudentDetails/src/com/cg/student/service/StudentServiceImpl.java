package com.cg.student.service;

import java.util.ArrayList;

import com.cg.bean.StudentInfo;
import com.cg.student.DAO.IStudentDAO;
import com.cg.student.DAO.StudentDAOImpl;


public class StudentServiceImpl implements IStudent{
IStudentDAO dao=null;
	
	public int insert(StudentInfo bean) {
		dao=new StudentDAOImpl();
		return dao.insert(bean);
}

	

	@Override
	public ArrayList<Integer> retrieveId() {
		dao=new StudentDAOImpl();
		return dao.retrieveId();
		
	}







	@Override
	public String givegrade(int total) {
		String grade=null;
		if(total>=91 && total<=100)
		{
			 grade = "S";
			 
		}
		else if(total>=81 && total<=90)
		{
			grade = "A";
		}
		else if(total>=71 && total<=80)
		{
			 grade = "B";
		}
		else if(total>=61 && total<=70)
		{
			 grade = "C";
		}
		else if(total>=51 && total<=60)
		{
			 grade = "D";
		}
		else if(total<=50)
		{
			 grade = "U";
		}
		return grade;
		
	}
}
