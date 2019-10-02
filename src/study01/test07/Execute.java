package study01.test07;

class Calc
{
	private int num1,num2;
	
	public Calc(int num1,int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	public void add()
	{
		System.out.println(num1 + num2);
	}
	public void minus()
	{
		System.out.println(num1 - num2);
	}
	public void multi()
	{
		System.out.println(num1 * num2);
	}
	public void divide()
	{
		System.out.println(num1 / num2);
	}
}

public class Execute 
{
	public static void main(String[] args)
	{
		Calc c = new Calc(5,3);

		c.add();
		c.minus();
		c.multi();
		c.divide();
	}
}