package study01.test11;

class Test1				//class 는 static 이다
{
	public static int num1 = 3;
}

public class Test 
{
	static int num = 3;
	int num2 = 3;
	
	public static void main(String[] args)
	{
		System.out.println(num);		//static 변수, 같은 클래스 안에있음으로 메모리생성 없이 사용가능
		Test t = new Test();
		System.out.println(t.num2);		//static변수가 아님으로 메모리를 생성하여 변수를 만들고 앞에 변수명을 넣어야함
		System.out.println(Test1.num1);	// << class변수 라고 메모리생성을 하지 않고 class 명을 앞에 추가하는 것 만으로 사용할 수 있음++
	}
}
