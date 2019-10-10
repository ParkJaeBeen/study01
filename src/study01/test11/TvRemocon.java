package study01.test11;

public class TvRemocon implements Remote		//implements = Remote 라는 interface 파일을 쓰겠다
{

	@Override									//Override 가 된 method 에만 사용할 수 있다.
	public void on() 							//Remote interface에 있는 on(),off() method 를 override한다
	{
		System.out.println("turn on the TV");
	}

	@Override
	public void off() 
	{
		System.out.println("turn off the TV");
	}
}
