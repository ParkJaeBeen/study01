package study01.test03;

public class ArrayTest 
{
	public static void main(String[] args)
	{
		//MVC MODEL VIEW CONTROLER
		int[] nums = new int[10];
		
		for(int i = 0;i < nums.length;i++)
		{
			nums[i] = (i+1) * 2;
			System.out.println("나는 "+ i +" 번 방의 " + nums[i]);
		}
	}
}
