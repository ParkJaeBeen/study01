package study01.test07;

class Calc2
{
	int a,b;
	
	public void ad()
	{
		System.out.println(a + b);
	}
	public void mi()
	{
		System.out.println(a - b);
	}
	public void mt()
	{
		System.out.println(a * b);
	}
	public void dvd()
	{
		System.out.println(a / b);
	}
}
public class ExecuteTest 
{
	public static void main(String[] args)
	{
		Calc2 c = new Calc2();
		c.a = 10;
		c.b = 2;
		c.ad();
		c.mi();
		c.mt();
		c.dvd();
	}
}
