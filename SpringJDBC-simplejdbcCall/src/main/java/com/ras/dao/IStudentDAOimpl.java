package com.ras.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.ras.model.Student;
@Repository("studDAO")
public class IStudentDAOimpl implements IStudentDAO {
	@Autowired
	private SimpleJdbcInsert sjt;
	
	@Override
	public int insert(Student stud) {
		//set db table name
		sjt.setTableName("STUDENT");
	//beanpropertysqlparameter source having modal class object(modal class match db table then use this condition)

		BeanPropertySqlParameterSource source=new BeanPropertySqlParameterSource(stud);
		return sjt.execute(source);
	}
	

/*	@Override
	public int insert(Student stud) {
		//set db table name
		sjt.setTableName("STUDENT");
	//PREPARE mysqlparamsource HAVING COL NAMES ANDVALUES
		MapSqlParameterSource source=new MapSqlParameterSource();
		source.addValue("sno",stud.getSno());
		source.addValue("sno",stud.getSname());
		source.addValue("sno",stud.getSadd());
		source.addValue("sno",stud.getAvg());
		
		return sjt.execute(source);
	}
	

	@Override
	public int insert(Student stud) {
		
		//set db table name
		sjt.setTableName("STUDENT");
		//PREPARE MAP COLLECTION HAVING COL NAMES AND col VALUES
		Map<String, Object> parammap=new HashMap();
		parammap.put("sno", stud.getSno());
		parammap.put("sname",stud.getSname());
		parammap.put("sadd", stud.getSadd());
		parammap.put("avg", stud.getAvg());
		int count=sjt.execute(parammap);
		
		return count;
	}
*/
}
