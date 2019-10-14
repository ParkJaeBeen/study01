package study01.test05;

class Father
{
	void work()
	{
		System.out.println("father is working");
	}
}

public class Son extends Father								//extends - 상속
{
	void work()
	{
		System.out.println("i work too");
	}
	public static void main(String[] args)					//args = arguments
	{
		Son s = new Son();
		s.work();
	}
}
