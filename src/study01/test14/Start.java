package study01.test14;

interface Test					//interface 는 생성자가 없다
{
	static void test()			//interface 안에서도 static method 는 영역을 가질 수 있다 (1.8ver부터 가능)
	{
		
	}
	
	default void test2()		//접근제어자를 default 로 선언하면 영역을 가질 수 있다.
	{
		
	}
}

final class alone								//ex) String 은 public final class 이다.
{
	public alone()
	{
		System.out.println("난 상속받을 수 없다");
	}
}

class End //extends alone 은 불가능하다 alone 은 final class 이기 때문이다. 
{
	final void test()							//method 에 붙는 final 은 overRiding 이 불가능하다
	{											//재정의 할 수 없는 method 를 만들때 쓰임
		System.out.println("final test");
	}
	
	final void test(int a)
	{
		
	}
}

public class Start extends End
{
//	 void test()								//overRiding 불가능
//	{
//		
//	}
	
	final void hi()								//overLoading은가능
	{
		System.out.println("final void");
	}
	
	final void hi(int a)
	{
		System.out.println("final int");
	}
	
	final void hi(String s)
	{
		System.out.println("final String");
	}
	
	public static void main(String[] args)
	{
		Start s = new Start();
		s.hi(1);
	}
}
