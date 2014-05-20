package org.wso2.carbonexample.employee.mgt.data;

import java.util.Date;

/**
 * 
 * @author gayan
 * 
 */
public class EmployeeRef {

	private String nicNumber;
	private String fName;
	private String lName;
	private String address;
	private int age;
	private Date dateOfJoin;

	public String getNICNumber() {
		return nicNumber;
	}

	public void setNICNumber(String nicNumber) {
		this.nicNumber = nicNumber;
	}

	public String getFirstName() {
		return fName;
	}

	public void setfirstName(String fName) {
		this.fName = fName;
	}

	public String getLastName() {
		return lName;
	}

	public void setLastName(String lName) {
		this.lName = lName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDateOfJoin() {
		return dateOfJoin;
	}

	public void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}
}
