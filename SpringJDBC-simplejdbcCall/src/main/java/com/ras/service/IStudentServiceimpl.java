package com.ras.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ras.dao.IStudentDAO;
import com.ras.model.Student;
@Service("studservice")
public class IStudentServiceimpl implements IStudentService {
	@Autowired
	private IStudentDAO studDAO;

	@Override
	public String insertstudent(Student stud) {
		int count=studDAO.insert(stud);
		return count==0?"student registartion failed":"student registration success...";
	}

}
