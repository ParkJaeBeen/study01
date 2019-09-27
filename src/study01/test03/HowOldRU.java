package study01.test03;

import java.util.Scanner;

public class HowOldRU 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("how old are you?");
		String age = scan.nextLine();
		//System.out.println("난" + age + "살이야");
		int num = Integer.parseInt(age);
		
		if(num <= 10)
		{
			System.out.println(num + "살은 어린이");
		}
		else if(num <= 20)
		{
			System.out.println(num + "살은 청소년");
		}
		else if(num <= 40)
		{
			System.out.println(num + "살은 청년");
		}
		else
		{
			System.out.println(num + "살은 꼰대");
		}
	}
}
