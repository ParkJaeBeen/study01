package study01.test10;

import java.util.Random;

public class Sort 
{
	public static void main(String[] args)
	{
		int[] ia = new int[10];
		Random r = new Random();
		//입력부
		for(int i=0;i<ia.length;i++)
		{
			ia[i] = r.nextInt(100);
		}
		//정렬
		for(int i = 0; i<ia.length; i++)
		{
			for(int j = i+1; j <ia.length ; j++)
			{
				if(ia[i] < ia[j])
				{
					int tempia = ia[i];
					ia[i] = ia[j];
					ia[j] = tempia;
				}
			}
		}
		//출력부
		for(int i = 0; i < ia.length; i++) 
		{
			System.out.println(ia[i]);
		}
	}
}
