package org.wso2.carbonexample.employee.mgt;

public class EmployeeException extends Exception {
	private static final long serialVersionUID = 4664456874499611218L;

	private String errorCode = "Employee service exception";

	public EmployeeException(String message, String errorCode) {
		super(message);
		this.errorCode = errorCode;
	}

	public EmployeeException(String message) {
		super(message);

	}

	public String getErrorCode() {
		return this.errorCode;
	}
}
