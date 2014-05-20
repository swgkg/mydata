package org.wso2.carbonexample.employee.mgt;

import java.util.HashMap;
import java.util.Map;

import org.wso2.carbonexample.employee.mgt.data.EmployeeRef;

public class EmployeeManager {

	private Map<String, EmployeeRef> emp;

	public EmployeeManager() {
		emp = new HashMap<String, EmployeeRef>();

		EmployeeRef emp1 = new EmployeeRef();
		emp1.setNICNumber("1xxxxxxx");
		emp1.setfirstName("Test");
		emp1.setLastName("Test");
		emp1.setAddress("Test Address");
		emp1.setAge(25);

		EmployeeRef emp2 = new EmployeeRef();
		emp2.setNICNumber("2xxxxxxxx");
		emp2.setfirstName("test	2");
		emp2.setLastName("Test 2");
		emp2.setAddress("Test Address");
		emp2.setAge(28);

		EmployeeRef emp3 = new EmployeeRef();
		emp3.setNICNumber("3xxxxxxxx");
		emp3.setfirstName("test	2");
		emp3.setLastName("Test 2");
		emp3.setAddress("Test Address");
		emp3.setAge(28);

		emp.put(emp1.getNICNumber(), emp1);
		emp.put(emp2.getNICNumber(), emp2);
		emp.put(emp3.getNICNumber(), emp3);
	}

	public void addEmployee(EmployeeRef employee) throws EmployeeException {
		if (employee == null || employee.getNICNumber() == null) {
			throw new EmployeeException("Invalid Student");
		}
		emp.put(employee.getNICNumber(), employee);
	}

	/**
	 * Delete the student having the give NIC number from the student store
	 * 
	 * @param nicNumber
	 *            Student NIC number
	 * @throws Exception
	 *             , if an invalid NIC number is given.
	 */
	public void deleteEmployee(String nicNumber) throws EmployeeException {
		if (nicNumber == null || emp.get(nicNumber) == null) {
			throw new EmployeeException("Invalid NIC Number");
		}

		emp.remove(nicNumber);
	}

	/**
	 * Returns an array of Student instances.
	 * 
	 * @return Student array.
	 */
	public EmployeeRef[] getEmployee() {
		EmployeeRef[] employee = new EmployeeRef[emp.size()];
		emp.values().toArray(employee);
		return employee;
	}
}
