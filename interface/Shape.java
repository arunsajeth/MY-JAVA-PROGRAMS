import java.util.*;

interface Shape
{
	void side();
	
}

class Square implements Shape
{
	public void side()
	{
		System.out.println("Square has four side");
	}
	public void area(int Side)
	{
		System.out.println(Side*Side);
	}
}

class Triangle implements Shape
{
	public void side()
	{
		System.out.println("Triangle has three side");
	}
	public void area(int Length,int Breadth)
	{
		System.out.println(0.5*Length*Breadth);
	}
}

class Circle implements Shape
{
	final double PI=3.142;

	public void side()
	{
		System.out.println("Circle has no side");
	}
	public void area(int radius)
	{
		System.out.println(PI*radius*radius);
	}
}

class MainShape
{
	public static void main(String[] a)
	{
		Scanner s=new Scanner(System.in);

		Square sq=new Square();
		sq.side();
		sq.area(s.nextInt());
		
		Triangle t=new Triangle();
		t.side();
		t.area(s.nextInt(),s.nextInt());
		
		Circle c=new Circle();
		c.side();
		c.area(s.nextInt());
	}
}