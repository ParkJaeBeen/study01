package study01.test07;

class Cat
{
	private int age;							//변수는 private 로 선언
	private String name;
	private String type;						//4. main 에서 대입된 값이 대입됨
	
	public void setAge(int age)					//변수를 쓰는 method 는 public 
	{													//	|
		this.age = age;									//	|
	}
												//POJO - Plain Old Java Object = 옛방식 그대로의 자바 오브젝트 
	public int getAge()
	{
		return age;
	}
	
	public void setName(String name)			//get,set method 에는 어떠한 계산,출력도 넣지 않는다
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setType(String type)			//2. main method 내에서 대입된 값을 읽고
	{
		this.type = type;						//3. this 를 통해 
	}
	
	public String getType()
	{
		return type;							//5. 대입된 값이 getType()에 return됨
	}
}

public class Access 
{
	public static void main(String[] args)
	{
		Cat c = new Cat();
		
		c.setAge(5);
		c.setName("blanky");
		c.setType("korean short");				//1. String type 에 "korean short" 라는 String값을 대입
		System.out.println(c.getType());		//6.return된 String "korean short" 값이 출력됨
		System.out.println(c.getName());
		System.out.println(c.getAge());
		System.out.println(c);
	}
}