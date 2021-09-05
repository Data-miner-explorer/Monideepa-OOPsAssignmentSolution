package com.greatlearning.model;

public class TechDepartment extends SuperDepartment{

	public String departmentName() 
	{
		String deptName="Tech Department";
		return deptName;		
	}
	public String getTodaysWork()
	{
		String todayWork="Complete coding of module 1";
		return todayWork;
	}
	public String getWorkDeadline()
	{
		String workDeadline="Complete by EOD";
		return workDeadline;
	}
	public String getTechStackInformation()
	{
		String techStack="core Java";
		return techStack;
	}

}
