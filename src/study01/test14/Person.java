package study01.test14;

public class Person 
{
	private String name;
	private int age;
	private String address;
	
	public void setName(String name)
	{
		this.name = name; 
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public String toString()			//VO ( Value Object )
	{
		return "age = "+ age + ", name = " + name + ", address = " + address; 
	}
}
