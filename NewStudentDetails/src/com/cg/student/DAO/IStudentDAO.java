package com.cg.student.DAO;

import java.util.ArrayList;

import com.cg.bean.StudentInfo;

public interface IStudentDAO {

	int insert(StudentInfo bean);

	

	ArrayList<Integer> retrieveId();

}
