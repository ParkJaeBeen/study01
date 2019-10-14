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
		String[] str2 = this.str;								//1.this.str 에 있는 기본값 저장변수
		this.str = new String[this.str.length + 1];				//2.this.str의 길이(기본 0)에 +1을 하는 String배열을 새로 만들어 this.str에 대입
		this.str[str.length - 1] = s;							//3.return되는 String값 s는 this.str의 length 보다 -1 된 곳에 저장(배열은 0번방부터 시작함으로)
		for(int i = 0; i < str2.length; i++)					//4.1번에 저장해놓은 기본 저장값과 저장된 s 를 불러와서 i 가 str2 의 길이 보다 작을때
		{
			str[i] = str2[i];									//str[] 에 -1 된 방에 str2[i] 를 대입
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
