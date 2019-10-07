package study01.test08;

class Cat
{
	public void sleep()
	{
		System.out.println("asleep");
	}
}

public class KoShort extends Cat
{
	public void sleep()
	{
		System.out.println("koshort sleep");
	}
	
	public static void main(String[] args)
	{
		Cat ks = new KoShort();
		
		Cat[] cat = new Cat[4];
		cat[0] = new KoShort();
		cat[1] = new Cat();
		cat[0].sleep();
		cat[1].sleep();
	}
}
