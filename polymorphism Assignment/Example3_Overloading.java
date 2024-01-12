class Example3_Overloading
{
	public void Shape(int radius)
	{
		System.out.println("Only one parameter so Circle");
	}
	public void Shape(int Length,int Breadth)
	{
		System.out.println("There are two parameter Rectangle");
	}
	public void Shape(int Length,int Breadth,int Height)
	{
		System.out.println("There are three parameters Cuboid");
	}
	public static void main(String a[])
	{
		Example3_Overloading exp3 = new Example3_Overloading();
		exp3.Shape(2);
		exp3.Shape(2,4);
		exp3.Shape(1,3,2);
	}
}