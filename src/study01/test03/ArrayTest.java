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
			System.out.println("int 배열  "+ i +"번째방의  " + nums[i]);
		}
	}
}
