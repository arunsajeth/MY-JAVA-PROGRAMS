class Main_2
{
	public static void main(String a[])
	{
		Employee2 e;
		e = new Employee2("ABC",101,1000);
		System.out.println(e);
		
		e = new Manager2("ABC",101,1000,"Product");
		System.out.println(e);
		
		e = new Admin2("ABC",101,1000,"Product");
		System.out.println(e);
		
		e = new Director2("ABC",101,1000,"Product",5000);
		System.out.println(e);

		e = new Engineer2("XYZ",102,2000);
		System.out.println(e);