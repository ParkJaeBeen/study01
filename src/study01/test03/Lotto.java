package study01.test03;

import java.util.Random;
import java.util.Scanner;  //Ctrl + Shift + o

public class Lotto 
{
	public static void main(String[] args)
	{
		System.out.println("lottery~");
		Scanner scan = new Scanner(System.in);
		int num1 = Integer.parseInt(scan.nextLine());//String num1 = scan.nextLine(); //입력 후 다음 라인에 입력되는 문자를 받아들임
		System.out.println("1 : " + num1);
		int num2 = Integer.parseInt(scan.nextLine());//String num2 = scan.nextLine();
		System.out.println("2 : " + num2);
		int num3 = Integer.parseInt(scan.nextLine());//String num3 = scan.nextLine();
		System.out.println("3 : " + num3);
		int num4 = Integer.parseInt(scan.nextLine());//String num4 = scan.nextLine();
		System.out.println("4 : " + num4);
		int num5 = Integer.parseInt(scan.nextLine());//String num5 = scan.nextLine();
		System.out.println("5 : " + num5);
		int num6 = Integer.parseInt(scan.nextLine());//String num6 = scan.nextLine();
		System.out.println("6 : " + num6);
		Random r = new Random();
		int correctCnt = 0;
		System.out.println("your number : " + num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6);
		System.out.println("this week lottery : ");
		
		/*
		*int a1 = Integer.parseInt(num1);
		*int a2 = Integer.parseInt(num2);
		*int a3 = Integer.parseInt(num3);
		*int a4 = Integer.parseInt(num4);
		*int a5 = Integer.parseInt(num5);
		*int a6 = Integer.parseInt(num6);
		*/
		
		for(int i = 1; i <= 6; i++)
		{
			int rNum = r.nextInt(45) + 1;
			
			System.out.print(rNum);
			
			if(num1 == rNum || num2 == rNum || num3 == rNum || num4 == rNum || num5 == rNum || num6 == rNum)
			{
				
				System.out.println(" 맞았다!");
				correctCnt++;
			}
			else
			{
				System.out.println(" 틀렸다!");
			}
		}
		System.out.println("맞은 횟수 : " + correctCnt);
	}
}