package study01.test04;

public class MethodTest 		//method(함수)는 무조건 class 안에 있어야한다
{								//class 안에서는 선언만 할 수 있다
	static int num = 1;
	
	static int num()
	{
		return 0;
	}
	
	public static void main(String[] args)				//static method 에서 실행시키기 위해서는 변수명 앞에 static이 붙어야 한다
	{													//method 안에서는 선언과 실행이 가능하다
		System.out.println(num);
	}
}