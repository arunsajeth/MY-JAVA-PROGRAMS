package demo;
import java.util.*;

class Mainclass
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Number of employees:");
		int n=s.nextInt();
		System.out.println("_________________");

		Employee1[] emp=new Employee1[n];

		for (int i=0;i<n;i++)
		{
			System.out.println((i+1)+"st Employee detail.");
			Employee1 e = new Employee1();
			System.out.println("Employee id:");
			e.setEid(s.nextInt());
			System.out.println("Employee name:");
			e.setEname(s.next());
			System.out.println("Employee salary:");
			e.setSalary(s.nextInt());
			System.out.println("_____________________");
			
			emp[i]=e;
		}
		
		for(Employee1 a:emp)
		{
			System.out.println(a);
		}
	}
}	
			
			
