package study01.test06;

public class ObjectTest 
{
	int num1,num2;
	String str = "";
	String str2 = new String("");
	
	public static void main(String[] args)
	{
		ObjectTest ot = new ObjectTest();		/*ObjectTest class 에 있는 변수들을 사용 할 수 있는 절대권한을 준다
												  A B = new A(); 는 A라는 새 메모리를 만들어 B에게 대입한다(덮어쓰기 아님)*/
		ot.num1 = 5;							
		ot.num2 = 10;
		System.out.println(ot.num1);					//5
		System.out.println(ot.num2);					//10
		ot = new ObjectTest();
		System.out.println(ot.num1);					//0
		System.out.println(ot.num2);					//0
		ObjectTest ot2 = new ObjectTest();
		System.out.println(ot.num2 == ot2.num1);		//true - num1과 num2가 같은 int형 변수로써 0이 같은 메모리에 저장이 됨
		System.out.println(ot.str == ot2.str);			//true - ""(빈문자)를 java는 한번 저장 한 후에 초기화하지 않는다
		ot2.str = new String("");
		System.out.println(ot.str == ot2.str);			//false - new String()은 값이 있든 없든 새로 만든다
		System.out.println(ot.str2 == ot2.str2);		//false - new String()은 값이 있든 없든 새로 만든다
	}
}
