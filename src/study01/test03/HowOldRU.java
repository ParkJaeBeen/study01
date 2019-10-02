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
			System.out.println(num + "���� ���");
		}
		else if(num <= 20)
		{
			System.out.println(num + "���� û�ҳ�");
		}
		else if(num <= 40)
		{
			System.out.println(num + "���� û��");
		}
		else
		{
			System.out.println(num + "���� ����");
		}
	}
}
