package study01.test04;

public class ObjectTest 				//접근제어자 - public protected private - 아무것도 안썼을때는 default
{										//public - 모든곳에서 사용가능
	int age;							//protected - 같은패키지 내에서 사용가능, 만약 상속받았다면 그곳에서도 사용가능
	String name;						//default - 같은 패키지 내에서 사용가능
										//private - 같은 class 내에서만 사용가능
	String getSrt()
	{
		return null;
	}
	
	public static void main(String[] args)
	{
		ObjectTest ot = new ObjectTest();				//ObjectTest method 안에 변수들을 모두 초기화
		System.out.println(ot.name);
		System.out.println(ot.age);
	}
}