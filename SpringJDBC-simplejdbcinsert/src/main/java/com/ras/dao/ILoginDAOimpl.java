package com.ras.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

@Repository("loginDao")
public class ILoginDAOimpl implements ILoginDAO {
	@Autowired
	private SimpleJdbcCall sjt;

	@Override
	public String authenticate(String username, String password) {
		sjt.setProcedureName("AUTH_PRO");
		//prepare map object having in paaram names and values
		Map<String,Object> inparam=new HashMap();
		inparam.put("user",username);
		inparam.put("pass",password);
		// call pl/sql procedure 
		Map<String,Object> outparam=sjt.execute(inparam);
		//gather result
		String res=(String)outparam.get("RESULT");
		
		return res;
	}

}
