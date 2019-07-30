package bean;

public class Bean 	
{
	String empname;
	int empid;
	float empsalary;
	
	
	public Bean(String empname, int empid, float empsalary) 
	{
		super();
		this.empname = empname;
		this.empid = empid;
		this.empsalary = empsalary;
	}


	public Bean() 
	{
		
	}


	public String getEmpname() {
		return empname;
	}


	public void setEmpname(String empname) {
		this.empname = empname;
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public float getEmpsalary() {
		return empsalary;
	}


	public void setEmpsalary(float empsalary) {
		this.empsalary = empsalary;
	}


	@Override
	public String toString() {
		return "empname=" + empname + " empid=" + empid + " empsalary=" + empsalary;
	}
	
	

}

