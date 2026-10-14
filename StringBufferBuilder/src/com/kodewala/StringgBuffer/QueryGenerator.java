package com.kodewala.StringgBuffer;

public class QueryGenerator {
	public StringBuilder generateQuery(int salary, String empId) {
		StringBuilder query = new StringBuilder("Select * from Employee"); // created sb object

		if (salary > 0) {
			query.append("where salary = " + salary + ";");
		} else if (empId != null) {
			query.append("Where empId = " + empId + ";");
		} else {
			query.append("Not in the company");
		}
		return query;
	}

}
