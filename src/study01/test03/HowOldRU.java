package study01.test03;

import java.util.Scanner;

public class HowOldRU 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("how old are you?");
		String age = scan.nextLine();
		//System.out.println("��" + age + "���̾�");
		int num = Integer.parseInt(age);
		
		
		if(num <= 10)
		{
			System.out.println(num + "살이하는애기");
		}
		else if(num <= 20)
		{
			System.out.println(num + "살이하는 청소년");
		}
		else if(num <= 40)
		{
			System.out.println(num + "살이하는 청년");
		}
		else
		{
			System.out.println(num + "살이상은 꼰대");
		}
	}
}
