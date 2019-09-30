package study01.test04;

public class MethodTest2 
{
	static void test()				//return 값이 없다
	{
		System.out.println(1);
	}
	
	static int getNum()				//method 의 데이터타입은 void 와 void 가 아닌, return 값이 있는, 없는 것으로 나뉘어진다
	{
		return 0;
	}
	
	public static void main(String[] args)
	{
		test();
		int a = getNum();
		System.out.println(a);
	}
}
