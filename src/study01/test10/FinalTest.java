package study01.test10;

class FF
{
	
}

public class FinalTest extends FF
{
	final int NM_TEST = 3;			//상수(변하지않음) 무조건 초기화해줘야함 대문자 에 _ 사용
	
	public static void main(String[] args)
	{
		int num = 3;
		String str;
		str = (num==3)?"num is 3":"num is not 3";		//삼항연산자 (num이 3일때 "num is 3" 3이 아닐 때 "num is not 3" 출력)
		System.out.println(str);
		System.out.println(str instanceof String);		//str 이 String 이라고 불려도 되는지?
		
		FinalTest ft = new FinalTest();
		System.out.println(ft instanceof Object);		//true
		System.out.println(ft instanceof FF);			//true
		System.out.println(ft instanceof FinalTest);	//true
		FF ff = new FinalTest();
		System.out.println(ff instanceof FinalTest);	//true
		ff = new FF();
		System.out.println(ft instanceof FinalTest);	//false
		
		ff = new FF();
//		ft = (FinalTest) ff;
//		System.out.println(ft instanceof FinalTest);	//error
		
		ff = new FF();
		
		if(ff instanceof FinalTest)						//ff가 FinalTest라고 불려도 될 때
		{
			ft = (FinalTest) ff;						//ff 의 형 변환 >> FinalTest 로
			System.out.println(ff instanceof FinalTest);		//instanceof = ff의 메모리가 정확히 무엇으로 되어있는지 알고싶을때
		}												//if문 실행이 안됨
	}
}