package com.greatlearning.main;
import com.greatlearning.model.*;
public class Main {

	public static void main(String[] args) {
		
		AdminDepartment adm=new AdminDepartment();
		System.out.println("Welcome to "+adm.departmentName());
		System.out.println(adm.getTodaysWork());
		System.out.println(adm.getWorkDeadline());
		System.out.println(adm.isTodayAHoliday());
		System.out.println();
		
		HrDepartment hrd=new HrDepartment();
		System.out.println("Welcome to "+hrd.departmentName());
		System.out.println(hrd.doActivity());
		System.out.println(hrd.getTodaysWork());
		System.out.println(hrd.getWorkDeadline());
		System.out.println(hrd.isTodayAHoliday());
		System.out.println();
		
		TechDepartment techd=new TechDepartment();
		System.out.println("Welcome to "+techd.departmentName());
		System.out.println(techd.getTodaysWork());
		System.out.println(techd.getWorkDeadline());
		System.out.println(techd.getTechStackInformation());
		System.out.println(techd.isTodayAHoliday());
		
		
		
		
	}

}

