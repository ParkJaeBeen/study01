package study01.test04;

import java.util.Random;

public class ArrayTest
{
	public static void main(String[] args)
	{
		/*long l = 12345678912l;		//������ int �� �⺻��, long���� ��Ÿ������ �ڿ� l�� �߰��������
		
		double db = 1.1;
		float f = 1.1f;		//�Ǽ��� double �� �⺻��, float���� ��Ÿ������ �ڿ� f�� �߰��������
		
		byte = 8bit = 2�� 7��
		short = 2byte
		int = 4
		long = 8
		
		char = 2
		*/
		Random r = new Random();
		
		int[] nums = new int[6];
		
		for(int i=0;i<nums.length;i++)		// "."(��) �ڿ� () �� ������ �Ӽ� , ������ �������� �ǹ�(����)
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
		/*for(int i = 0; i < nums.length;i++)
		{
			System.out.println(nums[i]);
		}*/
	}	
}