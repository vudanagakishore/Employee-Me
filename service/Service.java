package service;



import java.util.HashMap;
import java.util.regex.Pattern;

import bean.Bean;
import dao.Dao;
import exception.EmpException;


public class Service 
{
	Dao d;
	
	
	
	
	public Service()
	{
		d = new Dao();
	}
	
	
	/**
	 *	THis Method is for Sending Employee Details Into Dao Layer
	 **/
	
	public void insertEmployee(Bean b) 
	{
		
		d.insertEmployee(b);
	}
	
	

	/**
	 *	THis Method is Sending All Details Into The Dao Layer
	 **/
	
	
	
	
	
	public HashMap<Integer, Bean> getAllEmployees() throws EmpException 
	{
		return d.getAllEmployees();
		
	}
	
	
	
	
	

	/**
	 *	This Method is for Sending Employee Id To Dao Layer Which Is Required To Fetch From Record
	 **/
	
	
	
	
	public Bean getEmployeeById(int id) throws Exception 
	{
		return d.getEmployeeById(id);
		
	}


	public boolean isEmpNameValid(String empName)
	{
        boolean b=false;
          
              if(Pattern.matches("([A-Z])*([a-z])*", empName)&&empName.length()>=3 && Character.isUpperCase(empName.charAt(0)) )
          
                  b = true;
                  return b;
                 
          
	}


	public boolean isEmpSalaryValid(float empsalary) 
	{
		boolean b =false;
		
		if(empsalary>0)
			b = true;
			return b;
		
		
		
	}
}
