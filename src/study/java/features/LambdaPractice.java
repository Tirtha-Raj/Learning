package study.java.features;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class LambdaPractice {

	public static void main(String[] args) {
		Employee emp = new Employee();
		List<Employee> getEmpDetails = emp.getEmpDetails();

		Set<Integer> salarySet = new HashSet<Integer>();
//		1. Remove duplicate employees by ID. 
		List<Employee> removedDuplicateSalary = getEmpDetails.stream().filter(n -> salarySet.add(n.getSalary()))
				.toList();
		System.out.println("1. Remove duplicate salaried employees :  " + removedDuplicateSalary);

		Map<Integer, Employee> removedEmployeeByDuplicateSalary = getEmpDetails.stream()
				.collect(Collectors.toMap(Employee::getSalary, n -> n, (e1, e2) -> e1));
		System.out.println("1. Remove duplicate using map  :  " + removedEmployeeByDuplicateSalary.values());

		
//		2. Remove duplicates while preserving order. 
		Map<Integer, Employee> removedEmployeeByDuplicateSalary2 = getEmpDetails.stream()
				.collect(Collectors.toMap(Employee::getSalary, n -> n, (e1, e2) -> e1,LinkedHashMap::new));
		System.out.println("1. Remove duplicate while preserving order   :  " + removedEmployeeByDuplicateSalary2.values());
		
//		How does distinct() work internally? 
//		“distinct() is a stateful intermediate stream operation 
//			that internally maintains a Set to track previously seen elements. 
//		It determines uniqueness using hashCode() and equals(). For sequential streams, 
//		it preserves encounter order, but for parallel streams it may incur synchronization overhead. 
//		Because it relies entirely on object equality, 
//		it’s unsuitable when uniqueness needs to be defined by a specific field or custom logic.”
		
//		8️⃣ Why Collectors.toMap() is often better (senior move)
//		employees.stream()
//		    .collect(Collectors.toMap(
//		        Employee::getEmpId,
//		        e -> e,
//		        (e1, e2) -> e1,
//		        LinkedHashMap::new
//		    )).values();
//Here: Uniqueness rule is explicit		Conflict handling is explicit		Order handling is explicit
		
//		Why equals and hashCode matter? 
//	“equals() and hashCode() define object identity in Java collections. 
//	Hash-based collections first use hashCode() to locate a bucket and then equals() to resolve collisions. 
//	If these methods are inconsistent or incorrectly implemented, 
//		collections may allow duplicates, fail lookups, or behave unpredictably. 
//	This is why both must be overridden together and based on immutable identity fields.”
		
//		Convert List<Employee> → Map<Id, Employee>
		Map<Integer, Employee> employeeMap = getEmpDetails.stream().collect(Collectors.toMap(e -> e.getEmpId(), e->e));
		System.out.println("Convert List To Map  :  "+employeeMap);
		
//		Handle duplicate keys safely
		Map<Integer, Employee> employeeMapBySalary = getEmpDetails.stream().collect(Collectors.toMap(Employee::getSalary, e->e,(e1,e2) -> e1));
		System.out.println("Convert List To Map By Salary  :  "+employeeMapBySalary);
		
//		Handle null keys/values
		Map<Integer, Employee> employeeHandleNull = getEmpDetails.stream()
									.collect(Collectors.toMap(Employee::getSalary, e->e,(e1,e2) -> e1));
		System.out.println("Convert List To Map By Salary  :  "+employeeHandleNull);
		
		
	}
}
