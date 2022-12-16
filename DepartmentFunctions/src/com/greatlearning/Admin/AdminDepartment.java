package com.greatlearning.Admin;

import com.greatlearning.Super.SuperDepartment;

public class AdminDepartment extends SuperDepartment {
	
	public String departmentName() {
		String admindn = "Admin Department";
		return admindn;
	}
	public String getTodaysWork() {
		String admintoday = "Complete your documents submission";
		return admintoday;
	}
	public String getWorkDeadline() {
		String adminwork = "Complete by EOD";
		return adminwork;
	}
}
	