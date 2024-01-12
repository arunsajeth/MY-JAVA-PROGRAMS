class Except
{
	void divide(int n1,int n2)
	{
		int result=0;
		int arr[]=new int[5];
		try
		{
			result=n1/n2;
			arr[1000]=10;
		}
		/*catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}*/
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(result);

	}
	public static void main(String[] a)
	{
		Except exp=new Except();
		exp.divide(10,5);
	}
}