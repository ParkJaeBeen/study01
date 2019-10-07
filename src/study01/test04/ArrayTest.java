package study01.test04;

import java.util.Random;

public class ArrayTest
{
	public static void main(String[] args)
	{
		/*long l = 12345678912l;		//정수는 int 가 기본형, long으로 나타내려면 뒤에 l을 추가해줘야함
		
		double db = 1.1;
		float f = 1.1f;		//실수는 double 이 기본형, float으로 나타내려면 뒤에 f를 추가해줘야함
		
		byte = 8bit = 2�� 7��
		short = 2byte
		int = 4
		long = 8
		
		char = 2
		*/
		Random r = new Random();
		
		int[] nums = new int[6];
		
		for(int i=0;i<nums.length;i++)		// "."(점) 뒤에 () 가 없으면 속성 , 있으면 동사적인 의미(행위)
		{
			nums[i] = r.nextInt(6) + 1;
			for(int h = i - 1;h >= 0;h--)
			{
				if(nums[i] == nums[h])
				{
					i--;
					break;
				}
			}
		}
		for(int i = 0; i < nums.length;i++)
		{
			System.out.println(nums[i]);
		}
	}	
}