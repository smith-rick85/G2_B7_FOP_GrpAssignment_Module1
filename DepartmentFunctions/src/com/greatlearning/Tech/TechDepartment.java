package com.greatlearning.Tech;

import com.greatlearning.Super.SuperDepartment;

public class TechDepartment extends SuperDepartment {
	
	public String departmentName() {
		String techdn = "Tech Department";
		return techdn;
	}
	public String getTodaysWork() {
		String techtoday = "Complete coding of module 1";
		return techtoday;
	}
	public String getWorkDeadline() {
		String techwork = "Complete by EOD";
		return techwork;
	}
	public String getTechStackInformation() {
		String techstack = "Core Java";
		return techstack;
	}
}
