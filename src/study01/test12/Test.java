package study01.test12;

class Father
{
	public Father()
	{
		System.out.println("b");
	}
}

public class Test extends Father 
{
	public Test()
	{
		System.out.println("a");
	}
	
	public static void main(String[] args)
	{
		Test t = new Test();
	}
}
