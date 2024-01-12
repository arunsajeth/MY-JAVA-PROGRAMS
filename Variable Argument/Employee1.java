package demo;

class Employee1
{
	private int eid;
	private String ename;
	private int salary;

	Employee1()           // default constructor
	{
		eid=0;
		ename="null";
		salary=0;
	}
	public void setEid(int id)
	{
		eid=id;
	}
	public int getEid()
	{
		return eid;
	}
	public void setEname(String name)
	{
		ename=name;
	}
	public String getEname()
	{
		return ename;
	}
	public void setSalary(int sal)
	{
		salary=sal;
	}
	public int getSalary()
	{
		return salary;
	}
	public String toString()
	{
		return eid+" "+ename+" "+salary;
	}
}
