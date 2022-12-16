package com.greatlearning.HR;

import com.greatlearning.Super.SuperDepartment;

public class HrDepartment extends SuperDepartment {
	
	public String departmentName() {
		String hrdn = "Hr Department";
		return hrdn;
	}
	public String getTodaysWork() {
		String hrtoday = "Fill today’s timesheet and mark your attendance";
		return hrtoday;
	}
	public String getWorkDeadline() {
		String hrwork = "Complete by EOD";
		return hrwork;
	}
	public String doActivity() {
		String hractivity = "team Lunch";
		return hractivity;
	}
}
