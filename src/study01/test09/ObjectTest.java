package study01.test09;

public class ObjectTest 
{
	int num1;				//1. num1 을 main method 에서 이용하기 위해선
	static int num2;		//삐딱한 변수명은 static		ObjectTest.num2 >> ObjectTest 의 num2 변수
	
	public static void main(String[] args)
	{
		ObjectTest ot = new ObjectTest();	//2. num1의 위치를 알려줘야 함
		ot.num1 = 10;
		System.out.println(ot.num1);
		
		System.out.println(num2);					//0		이 명과
		num2 = 3;									//num2는 static 변수이므로 위치를 알려주지 않아도 됨
		System.out.println(ObjectTest.num2);		//3		이 명은 같은 변수명
		
		ot.num2 = 10;								//static에 선언 초기화 시 
		ot = new ObjectTest();						//class 를 다시 초기화 해도
		System.out.println(ot.num2);				//num2의 값은 10으로 남아있음,초기화되지않음
	}
}																																