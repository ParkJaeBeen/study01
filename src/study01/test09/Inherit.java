package study01.test09;

import study01.test08.Atom;

public class Inherit extends Atom
{
	public String toString()
	{
		return "return toString";
	}

	public static void main(String[] args)
	{
		/*Object o;			//object는 모든 변수형을 포함할 수 있다
		o = 1;
		o = 1.1;
		o = 'a';
		o = "hello";
		o = true;
		o = new Scanner(System.in);
		o = new Atom();
		*/
		Inherit i = new Inherit();
		//i.defaltTest(); << 안됨
		//i.privateTest(); << 안됨
		//i.publicTest(); << 됨
		//i.protectedTest(); << 상속받았으니 됨
		System.out.println(i);		//메모리주소값만 나옴 (출력을 위해선 toString() 이 필요)
	}								//현재 toString() 에 override 를 통해 return toString 을 return 시켜 덮어씌움
}
