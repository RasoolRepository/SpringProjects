package com.ras.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ras.dao.ILoginDAO;

@Service("service")
public class ILoginserviceimpl implements ILoginmgmtservice {
	@Autowired
	private ILoginDAO loginDao;
	

	@Override
	public String singnin(String username, String password) {
		
		return loginDao.authenticate(username, password);
	}

}
