package study01.test08;

class Animal		//Animal은 Object 에 상속받고있다(아무것도 상속받지 않는 class 는 object를 상속받는다)
{
	public void asd()
	{
		System.out.println("hi");
	}
}

class Dog extends Animal			//한 class 에 두가지 class 를 상속 받을 수 없다(단일상속)
{
	
}

public class Jindo extends Dog		//public 이 앞에 붙는 class 는 파일명과 같은 class만 가능하다
{
	public static void main(String[] args)
	{
		Object o = new Jindo();		//Animal 이 상속받고있는 Object 를 이어 상속받는 Jindo
		//o.asd();		//Animal 이 가진 asd() 를 알 수 없는 object
		Animal a = new Jindo();
		a.asd();		//Animal 이 가진 asd() 를 알 수 있다
		Dog d = new Jindo();
		d.asd();		//Animal 이 가진 asd() 를 알 수 있는 Animal 의 하위개체 Dog
	}
}
				//상속 최하위는 상위개체들이 무엇을 가지고 있는지 알수있지만 상위개체는 한단계 밑의 상속자라도 그 안에 무엇이 있는지 알 수 없다