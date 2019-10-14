package study01.test13;

public class MyListTest 
{
	private String[] str;
	
	public MyListTest()
	{
		this.str = new String[0];
	}
	
	public void add(String s)
	{
		String[] str2 = this.str;
		this.str = new String[this.str.length + 1];
		this.str[str.length - 1] = s;
		for(int i = 0; i < str2.length; i++)
		{
			str[i] = str2[i];
		}
	}
	
	public static void main(String[] args)
	{
		MyListTest mlt = new MyListTest();
		mlt.add("1");
		mlt.add("2");
		mlt.add("3");
		System.out.println(mlt.str[0]+","+mlt.str[1]+","+mlt.str[2]);
	}
}
