package study01.test07;

public class ArrayTest 
{
	public static void main(String[] args)
	{

		String[] strs = new String[5];
		/*
		strs[0] = "10";
		strs[1] = "20";
		strs[2] = "30";
		strs[3] = "40";
		strs[4] = "50";
		*/
		for(int h = 0; h<strs.length; h++)
		{
			strs[h] = (h + 1) * 10 + "";									//문자 + 다른 데이터타입 = 문자
		}
		for(int i = 0; i<strs.length;i++)
		{
			System.out.println(strs[i]);
		}
	}
}