class Demo
{
	void myfun(int n1,int n2,int size,String Str) throws Exception
	{
		int Arr[] = new int[size];
		if(Str==null)
		{
			throw new NullPointerException();
		}
		else
		{
			System.out.println(Str.length());
		}
		if(n2==0)
		{
			throw new ArithmeticException();
		}
		for(int i=0;i<size;i++)
			Arr[i]=i+1;
		for(int i:Arr)
			System.out.println(i);
	}
	public static void main(String[] a)
	{
		Demo d=new Demo();
		try
		{
			d.myfun(10,0,5,null);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
