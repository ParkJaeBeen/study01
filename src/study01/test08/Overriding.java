package study01.test08;

class Mother
{
	public void a()
	{
		System.out.println('a');
	}
}

public class Overriding extends Mother 
{
	public void a() 
	{
		System.out.println('b');
	}
	
	public static void main(String[] args)
	{
		Overriding m = new Overriding();
		m.a();
	}
}
