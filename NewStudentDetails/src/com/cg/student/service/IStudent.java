package com.cg.student.service;

import java.util.ArrayList;

import com.cg.bean.StudentInfo;

public interface IStudent {



	ArrayList<Integer> retrieveId();

	int insert(StudentInfo bean);

	

	String givegrade(int total);

}
