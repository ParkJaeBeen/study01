package study01.test05;

class Father
{
	void work()
	{
		System.out.println("fater is working");
	}
}

public class Son extends Father
{
	void work()
	{
		System.out.println("i work too");
	}
	public static void main(String[] args)
	{
		Son s = new Son();
		s.work();
	}
}
