package dao;

import java.util.HashMap;


import bean.Bean;
import exception.EmpException;

public class Dao 
{
	Bean b;
	public Dao()
	{
		b = new Bean();
	}
	
	
	/**
	    * map to hold the data
	    */
		private static HashMap<Integer,Bean> map=new HashMap<Integer,Bean>();
		
	    
	    
	    /**
	    * getter for map
	    */   
	    public static void setMap(HashMap<Integer,Bean> map)
	    {
			Dao.map=map;
	    }  
	    
	    /**
	     * Setter for the map
	     */
	    
	    public static HashMap<Integer,Bean> getMap()
	    {
			return map;
	    }

	    /**
		 *	THis Method is for Inserting Employee Details Into The Record
		 **/
		
	
	public void insertEmployee(Bean b) 
	{
		map.put(b.getEmpid(), b);
		//System.out.println("yes");
	}
		
	

	/**
	 *	THis Method is for Getting All Employee Details From The Record
	 **/
	
	
	
	
	
	
	
	
	public HashMap<Integer, Bean> getAllEmployees() throws EmpException 
	{
		
		
		return map;
	}
	
	
	/**
	    * This Method is for Getting Employee Details Based On The Id From The  Record

	    **/

	
	

	
	
	public Bean getEmployeeById(int id) throws EmpException
	{
		if(map.containsKey(id))
		{
			b =map.get(id);
			
		
		}
		else
		{
		  throw new  EmpException("No record Found");
		}
		
		return b;
		
		
	}  

	
	
	
	
}
