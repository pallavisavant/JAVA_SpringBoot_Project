package com.example.restdemo.dao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.restdemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class EmployeeDaoJpaImpl implements EmployeeDao{
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Employee> findAll() {	
    TypedQuery<Employee> query = entityManager.createQuery("from Employee",Employee.class);
    List<Employee> employees = query.getResultList();	
    return employees;
	}

	@Override
	public Employee findById(int id) {
		Employee employee = entityManager.find(Employee.class,id);
		return employee;
	}

	@Override
	public Employee save(Employee employee) {
		//save or update
		Employee dbEmployee = entityManager.merge(employee);
		return dbEmployee;
	}

	@Override
	public void deleteById(int id) {
		Employee employee = entityManager.find(Employee.class,id);
		entityManager.remove(employee);

	}
}
