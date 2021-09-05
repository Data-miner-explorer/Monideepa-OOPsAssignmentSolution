package com.greatlearning.model;

public class AdminDepartment extends SuperDepartment{

		public String departmentName() 
		{
			String deptName="Admin Department";
			return deptName;		
		}
		public String getTodaysWork()
		{
			String todayWork="Complete your documents Submission";
			return todayWork;
		}
		public String getWorkDeadline()
		{
			String workDeadline="Complete by EOD";
			return workDeadline;
		}
	
	}
