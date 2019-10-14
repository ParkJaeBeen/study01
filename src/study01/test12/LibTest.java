package study01.test12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class LibTest
{
	public static void main(String[] args)
	{
		List<String> ages = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		//입력부
		for(int i = 1; i <= 10; i++)
		{
			System.out.println("age : ");
			String age = scan.nextLine();
			age = StringUtils.leftPad(age, 3, "0");
			ages.add(age);
		}
		Collections.sort(ages);
		
		//출력부
		for(int i = 0;i<ages.size();i++)
		{
			System.out.println(ages.get(i));
		}
	}
}