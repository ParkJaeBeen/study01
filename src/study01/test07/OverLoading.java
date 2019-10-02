package study01.test07;

public class OverLoading 	//method 명이 같을 때 괄호 내에 변수형을 지정하는 방식으로 method 의 변수형을 변경하여 같은 이름으로도 사용할 수 있게 하는 것 - overloading
{
	public void test()										// () << paraments or arguments - 갯수,위치,변수형에 상관없이 선언가능
	{
		System.out.println("test() method");
	}
	public void test(int num)
	{
		System.out.println("test(int) method");
	}
	public void test(String st)
	{
		System.out.println("test(String) method");
	}
	public void test(String st,int num)
	{
		System.out.println("test(String,int) method");
	}
	public void test(int num,String st)
	{
		System.out.println("test(int,String) method");
	}
	
	public static void main(String[] args)
	{
		OverLoading O = new OverLoading();
	}
}