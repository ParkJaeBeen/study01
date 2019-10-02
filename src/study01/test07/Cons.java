package study01.test07;

public class Cons 
{
	int num;
	
	public Cons()									//생성자 - 무언가를 실행하기 전에 반드시 선행되어야할 것이 있을 때 만들어준다
	{												//return 타입이 없다		
		System.out.println("호출!");					//생성자에 overloading 은 가능
	}
	
	public Cons(int num)							
	{
		System.out.println("int형 생성자 호출");		
	}
	
	public static void main(String[] args)
	{
		Cons c = new Cons();						//Cons c = new ★"Cons();"★ - 생성자
		System.out.println(c.num);
	}												//생성자는 class 명과 동일해야한다
}													//접근제어자 protected 는 불가능하다		