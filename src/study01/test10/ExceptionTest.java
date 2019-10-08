package study01.test10;

public class ExceptionTest			//예외 테스트 
{
	public static void main(String[] args)
	{
		String str = "일이삼사";
		try
		{
			int num = Integer.parseInt(str);
		}
		catch(Exception e)
		{
			System.out.println(str + "is not a number");
		}
		finally
		{
			System.out.println("무조건 실행됨");
		}
		System.out.println("finish");
	}
}
