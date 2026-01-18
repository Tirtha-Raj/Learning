package study.java.features;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private Integer empId;
	private String department;
	private Integer salary;
	private String name;
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", department=" + department + ", salary=" + salary + ", name=" + name
				+ "]";
	}
	
	 public List<Employee> getEmpDetails() {

	        List<Employee> employees = new ArrayList<>();

	        employees.add(createEmployee(1, "IT", 50000, "Amit"));
	        employees.add(createEmployee(2, "HR", 40000, "Ravi"));
	        employees.add(createEmployee(3, "Finance", 70000, "Neha"));
	        employees.add(createEmployee(4, "IT", 80000, "Suresh"));
	        employees.add(createEmployee(5, "Admin", 40000, "Kiran"));
	        employees.add(createEmployee(6, "HR", 50000, "Anjali"));
	        employees.add(createEmployee(7, "IT", 90000, "Rahul"));
	        employees.add(createEmployee(8, "Finance", 70000, "Pooja"));
	        employees.add(createEmployee(9, "Admin", 40000, "Vikas"));
	        employees.add(createEmployee(10, "IT", 100000, "Arjun"));

	        return employees;
	    }

	    private Employee createEmployee(int id, String dept, int salary, String name) {
	        Employee e = new Employee();
	        e.setEmpId(id);
	        e.setDepartment(dept);
	        e.setSalary(salary);
	        e.setName(name);
	        return e;
	    }
	
}
