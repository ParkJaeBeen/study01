package study01.test10;

class OverLoading
{
	public void a()
	{
		System.out.println("void");
	}
	
	public void a(int a)
	{
		System.out.println("int");
	}
	
	public void a(double a)
	{
		System.out.println("double");
	}
	
	public void a(String a)
	{
		System.out.println("String");
	}
}

public class OlTest 
{
	public static void main(String[] args)
	{
		OverLoading ol = new OverLoading();
		ol.a("1");
	}
}
