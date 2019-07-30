package ui;

import java.util.Scanner;

import bean.Bean;
import service.Service;

public class Main 
{
	public static void main(String [] args)
	{
		Scanner scan = new  Scanner(System.in);
		Bean b = new Bean();
		Service s = new Service();
		while(true)
		{
			System.out.println("1-Add Employee");
			System.out.println("2-Get All Employee Details");
			System.out.println("3-Get Employee By Id");
			System.out.println("4-Exit");
			int choice = scan.nextInt();
			switch(choice)
			{
			case 1: 
				
				
				/**
				 * This case is for  Add Employee Details
				 **/
				
				
				System.out.println("Enter The Employee Details");
				
				

				/**
				 * This is Validation For Employee Name
				 **/
				
				String empname;
				do {
		            System.out.println("Enter the Employee Name ");
		            empname=scan.next();
		            }
		            while(!s.isEmpNameValid(empname));
				
				
				
				
				System.out.println("Enter The Employee id");
				int empid = scan.nextInt();
				
				float empsalary;
				do
				{
					System.out.println("Enter The Employee Salary");
					empsalary = scan.nextFloat();
				}
				while(!s.isEmpSalaryValid(empsalary));
				
				b = new Bean(empname,empid,empsalary);
				s.insertEmployee(b);
				System.out.println("Employee added");
				break;
				
				
				
			case 2:
				
				/**
				 * This case is for Printing All Employee Details
				 **/
				
				
				System.out.println("Printing all the details");
				
				try {
					System.out.println(s.getAllEmployees());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				break;
				
			case 3:
				
				/**
				 * This case is for  retrieving Employee Details By Id
				 **/
				
				System.out.println("Enter The Employee id");
				int id = scan.nextInt();
				try {
					System.out.println(s.getEmployeeById(id));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
				
				
			case 4:
				
				/**
				 * This case is for Exiting From The Service
				 **/
				
				
				
				
				System.out.println("End");
				System.exit(0);
				break;
				
				
			default:
				
				/**
				 * This case is for  When User Does Not Enter The Correct Choice
				 **/
				
				
				
				
				System.out.print("Enter the valid choice");
				
				break;
				
				
			}
			
		}
		
	}
}
