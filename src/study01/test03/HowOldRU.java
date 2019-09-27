package study01.test03;

import java.util.Scanner;

public class HowOldRU 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("how old are you?");
		String age = scan.nextLine();
		System.out.println("난" + age + "살이야");
	}
}
