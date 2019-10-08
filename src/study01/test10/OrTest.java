package study01.test10;

class OverRiding
{
	String food = "음식";
	
	public void eat()
	{
		System.out.println(food + " (을)를 먹는다");
	}
}

public class OrTest extends OverRiding
{
	public void eat()
	{
		food = "파스타";
		System.out.println(food + "를 먹는다");
	}
	public static void main(String[] args)
	{
		OrTest or = new OrTest();
		or.eat();
	}
}
