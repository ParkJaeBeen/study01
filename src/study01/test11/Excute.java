package study01.test11;

public class Excute 
{
	public static void main(String[] args)
	{
//		Remote tv = new TvRemocon();			//interface 파일을 데이터 타입으로 사용할 수 있다.
//		Remote air = new AirconRemocon();
//		
//		air.on();
//		tv.on();
		int age = 30;
		
		switch(age)
		{
		case 10 : 
			System.out.println("10살이하");
			break;
		case 20 : 
			System.out.println("20살이하");
			break;
		case 30 : 
			System.out.println("30살이하");
			break;
		case 40 : 
			System.out.println("40살이하");
			break;
		default : 
			System.out.println("40살이상");
			break;
		}
	}
}
