package com.greatlearning.department;

public class Main {

	public static void main(String[] args) {
		
		AdminDepartment ad = new AdminDepartment();
		HrDepartment hd = new HrDepartment();
		TechDepartment td = new TechDepartment();
		
		System.out.println(" Welcome to"+ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayHoliday());
		
		System.out.println();
		System.out.println();
		
		System.out.println(" Welcome to"+hd.departmentName());
		System.out.println(hd.doActivity());
		System.out.println(hd.getTodaysWork());
		System.out.println(hd.getWorkDeadline());
		System.out.println(hd.isTodayHoliday());

		System.out.println();
		System.out.println();
		
		System.out.println(" Welcome to"+td.departmentName());
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(td.isTodayHoliday());
	}

}
