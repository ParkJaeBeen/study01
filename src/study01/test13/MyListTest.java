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
		
		String s = "asd";
		s.substring(1);									//substring으로 선언해도
		System.out.println(s);							//s의 값이 바뀌는 것은 아니다		(asd)
		
		s = s.substring(1);								//값을 바꾸고싶을때는 substring으로 바뀐 값을 대입해주면 된다.
		System.out.println(s);							//(sd)
		
		s = s.substring(1,2);							//1번방부터 2번방까지의 값만
		System.out.println(s);							//출력된다(d)
		
		String h = "가나다라마바사아";
		h = h.substring(0, h.length() - 1);
		System.out.println(h);
		
		String[] strs = new String[5];
		strs[0] = "1";
		strs[1] = "2";
		strs[2] = "3";
		strs[3] = "4";
		strs[4] = "5";
		
		String str = "[";
		for(int i = 0; i<strs.length;i++)
		{
			str += strs[i] + ",";
		}
		str = str.substring(0,str.length() - 1);
		str += "]";
		
		System.out.println(str);	
	}
}
