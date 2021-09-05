package com.greatlearning.model;

public class HrDepartment extends SuperDepartment {

	public String departmentName() 
	{
		String deptName="HR Department";
		return deptName;		
	}
	public String getTodaysWork()
	{
		String todayWork="Fill today’s worksheet and mark your attendance";
		return todayWork;
	}
	public String getWorkDeadline()
	{
		String workDeadline="Complete by EOD";
		return workDeadline;
	}
	public String doActivity()
	{
		String doAct="team Lunch";
		return doAct;
	}

}
