package study01.test06;

public class MethodTest2 
{
	int num;
	
	int getNum()									//()안에는 선언만 가능, 초기화 불가능
	{
		int num = 1;
		System.out.println(num);					//getNum 의 num
		System.out.println(this.num);				//MethodTest2 의 num			this. 
		return 0;
	}
	public static void main(String[] args)
	{
		MethodTest2 m2 = new MethodTest2();
		m2.getNum();
		System.out.println(m2.num);
	}
}