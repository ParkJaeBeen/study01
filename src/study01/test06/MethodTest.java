package study01.test06;

public class MethodTest 
{
	public static void main(String[] args)
	{													//new 는 정해져있지 않은 데이터타입에만 가능
		/*
		String str = "string이다";						//string = 정해져있지 않은 데이터타입 but 'new'를 생략 가능
		String str1 = new String("string이다");			//new 를 붙였을때는 java 메모리가 아닌 새로운 메모리에 저장됨
		String str2 = new String("string이다");			//생략하지 않아도 됨
														
		System.out.println(str == "string이다");			//true
		System.out.println(str2 == "string이다");		//false			저장된 공간이 같은지 다른지 를 묻는것
		
		System.out.println(str == str1);
		System.out.println(str == str2);
		System.out.println(str1 == str2);
		
		System.out.println(str.equals(str1));			//String 이 가지고 있는 equals 라는 method - String 을 비교하기 위해서 쓰임
		
		int a = 1;
		int b = 1;
		System.out.println(a == b);
		*/												//string 은 char[]
		String str = "1234567";							//1은 0번째 방(index) 에 위치하고있다
		int idx = str.indexOf("10");					//String 에 없는 숫자의 방을 출력시 -1이 출력됨, 포함된 숫자의 방을 출력시 -1값이 출력됨 ex)3 = 2, 34567 = 2
		//System.out.println("10 = " + idx);				//indexOf = 중요, datatype = int
		
		String names = "하나,둘,셋,넷,다섯,여섯";
		String[] strs = names.split(",");				//split = 기준점을 지정해 배열을 나눔
		for(int i = 0; i < strs.length;i++)
		{
			System.out.println(strs[i]);
		}
	}
}