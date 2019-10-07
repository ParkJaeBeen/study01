package study01.test09;

import java.util.ArrayList;
import java.util.Random;

public class StringArray 
{
	public static void main(String[] args)
	{
		String[] strs = new String[10];
		//입력부
		Random r = new Random();
		
		for(int i = 0; i < strs.length; i++)
		{
			int rNum = r.nextInt(20) + 1;
			strs[i] = rNum + "";
		}
		
		//출력부
		for(int i = 0; i < strs.length; i++)
		{
			//System.out.println(strs[i]);
		}
		
		ArrayList<String> strList = new ArrayList<String>();			//사이즈가 유동적이라 마음대로 조절 가능
		strList.add("하나");
		strList.add("둘");
		strList.add("셋");
		strList.add("넷");

		for(int i = 0; i<strList.size(); i++)
		{
			System.out.println((i + 1) + ". " + strList.get(i));
		}
		System.out.println(strList.indexOf("다섯"));				//list 에 없는 것을 찾으면 -1 이 츌력됨
		
		ArrayList<Integer> intList = new ArrayList<Integer>();		// <> 안에 모든 변수형 가능, 대신 앞자리가 대문자(wrapperclass) 
		intList.add(1);
		intList.add(2);
		intList.add(3);
		System.out.println(intList);
	} 
}