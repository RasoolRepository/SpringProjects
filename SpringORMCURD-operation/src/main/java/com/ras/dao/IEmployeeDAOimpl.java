package com.ras.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ras.entity.Employee;

@Repository("empDAO")
public class IEmployeeDAOimpl implements IEmployeeDAO {
	      
	@Autowired
	private HibernateTemplate ht;

	@Override
	public int insertemployee(Employee emp) {
		// TODO Auto-generated method stub
		
		ht.setCheckWriteOperations(false);//set whetherto check the hibernate session is not in read only mode in case of write operation
		int idval=(Integer)ht.save(emp);//(save/update/delete)
		return idval;
	}

	@Override
	public List<?> getallemployees() {
		List<?> list=ht.find("from Employee");//bulk select option
		return list;
	}

	@Override
	public Employee getemployeebyno(int no) {
		// TODO Auto-generated method stub
		return ht.get(Employee.class,no);//single record selection
	}

	@Override
	public String updateemployeesalary(int no,int sal) {
		// TODO Auto-generated method stub
		//get employee object based given empno
		
		Employee emp=getemployeebyno(no);
		//ipdate the sala
		emp.setSal(sal);
		ht.setCheckWriteOperations(false);
		ht.update(emp);
		
		return "employee details are update with newsalary::"+sal;
	}

	@Override
	public String deletemployee(int no) {
		// TODO Auto-generated method stub
		Employee emp=getemployeebyno(no);
		ht.setCheckWriteOperations(false);
		ht.delete(emp);
		return "employe is deleted::";
	}

}
