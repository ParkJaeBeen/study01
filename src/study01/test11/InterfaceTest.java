package study01.test11;

interface Promise		//interface 는 자기 영역을 가질 수 없다.
{
	void test();		//interface 내에서 접근제어자를 선언하지 않았을때는 기본 접근제어자가 public(다른 접근제어자 사용 불가능)
}

class Father
{
	void test2()
	{
		
	}
	
//	int test3()
//	{
//		
//	}
}

public class InterfaceTest extends Father implements Promise		//implements = 구현하다
{
	public void test()								//interface 는 반드시 overRiding을 해주어야한다
	{
		
	}
	
	public void test2()								//overRiding된 method 의 접근제어자는 상속하는 class 에서 선언한 접근제어자보다 클 때만 된다
	{												//ex) public > protected > default > private
		
	}
	
//	public void test3()							//overRiding 은 return type 도 같아야 한다 
//	{											//test3()은 int, InterfaceTest 의 test3()은 void 이므로 성립하지 않음			
//		
//	}
	
	public static void main(String[] args)
	{
		
	}
}
