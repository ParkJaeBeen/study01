package study01.test11;

public class AirconRemocon implements Remote 
{
	@Override
	public void on() 
	{
		System.out.println("turn on the Aircon");
	}

	@Override
	public void off() 
	{
		System.out.println("turn off the Aircon");
	}
}
