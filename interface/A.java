interface A
{
	default void display()
	{
		System.out.println("HI");
	}
}
interface B
{
	default void display()
	{
		System.out.println("HELLO");
	}
}
class Main implements A,B
{
	public void display()
	{
		System.out.println("HI HELLO");
	}
	public static void main(String[] a)
	{
		Main m = new Main();
		m.display();
	}
}
