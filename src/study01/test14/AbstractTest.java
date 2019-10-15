package study01.test14;

public abstract class AbstractTest 			//abstract = 추상 
{											//abstract class 는 new 로 메모리 생성을 할 수 없다
	public abstract void test();			
	
	
}

class Son extends AbstractTest				//추상 클래스는 상속받은 클래스에서만 메모리생성을 할 수 있다.
{
	@Override
	public void test() 
	{
		System.out.println("AbstractTest class 를 상속받은 Son class");
	}
	
	public static void main(String[] args)
	{
//		AbstractTest at2 = new AbstracTest();		//이건 안됨
		AbstractTest at = new Son();				//이건 됨
		at.test();
	}
}
