package study01.test11;

public class ContinueTest 
{
	public static void main(String[] args)
	{
		for(int i = 0; i <= 10; i++)
		{
			if(i % 2 == 0)				//만약 i 가 2 로 나누었을 때 나머지가 0이라면
				continue;				//밑의 실행부를 실행시키지 않고 조건식으로 다시 올라감
			System.out.println(i);
		}
	}
}
