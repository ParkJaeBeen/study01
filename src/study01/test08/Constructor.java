package study01.test08;

class Father		//3. class 를 읽는다
{
	Father()			//2.
	{
		System.out.println("Father 의 생성자");		//4. 실행
	}
}
//생성자는 overRiding 이 불가능하다 (overRiding 은 상속이 기본전제)
public class Constructor extends Father		//Constructor = 생성자
{
	Constructor()		//5. class를 읽고
	{
		System.out.println("Constructor 의 생성자");		//6.실행
	}
	
	public static void main(String[] args)
	{
		Constructor c = new Constructor();		//1. c reading		7.c 실행
	}
}