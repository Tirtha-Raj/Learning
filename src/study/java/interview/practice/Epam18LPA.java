package study.java.interview.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Epam18LPA {
	public static void main(String[] args) {

//		Q.You are given a sentence and you have to fetch the longest word in that sentence using Java 8 Streams, for Example, if the sentence is "This is a stream problem".
		String[] sentence = "This is a stream problem".split(" ");

		Optional<String> longestWord = Arrays.stream(sentence).sorted((a, b) -> b.length() - a.length()).findFirst();
		System.out.println("Bruteforce : " + longestWord.get());

		String longestWordOptimal = Arrays.stream(sentence).max(Comparator.comparingInt(String::length)).orElse("");
		System.out.println("Optimal : " + longestWordOptimal);

//		Q. You are Given a Employee class, which consists of name, age, salary, and department So fetch all employee whose salary is greater than 50000 by using stream api.
		List<Employee> emps = Employee.getEmployeeList();
		List<Employee> highValEmps = emps.stream().filter(n -> n.getSalary() > 50000).collect(Collectors.toList());
		System.out.println(highValEmps);

//		Q. Write a junit unit test of calculating prime numbers by using junit5 and Mockito framework
		System.out.println("11 is prime : " + findPrime(11));
		System.out.println("51 is prime : " + findPrime(51));

	}

	public static boolean findPrime(int n) {
		if (n < 2)	return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) 	return false;
		}
		return true;
	}
}

//class PrimeTest{
//	
//	@Tes
//	void testValidPrime() {
//		a
//	}
//}

class Employee {

	private String name;
	private int age;
	private int salary;
	private String department;

	public Employee(String name, int age, int salary, String department) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.department = department;
	}

	public static List<Employee> getEmployeeList() {
		Employee ram = new Employee("Ram", 24, 44000, "ME");
		Employee sita = new Employee("Sita", 25, 55000, "IT");
		Employee laksman = new Employee("Laksman", 40, 40000, "CIVIL");
		Employee bharat = new Employee("Bharat", 34, 59000, "IT");

		List<Employee> list = new ArrayList<Employee>();
		list = Arrays.asList(ram, sita, laksman, bharat);
		return list;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", department=" + department + "]";
	}

}