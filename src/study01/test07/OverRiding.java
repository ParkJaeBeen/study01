package study01.test07;

class Mother
{
	public void cook()							//1. cook method 에 cooking... 을 출력한다 
	{
		System.out.println("cooking.....");
	}
}

public class OverRiding extends Mother			//0. extends Mother = Mother class 를 상속한다
{
	public void cook()							//2. Son class 내에서 cook() method 를 덮어 씌운다(Mother class의 cook()은 사라지지 않는다)
	{
		super.cook();							//Mother class 의 cook() 을 출력
		System.out.println("rameon");
	}
	
	public static void main(String[] args)
	{
		OverRiding s = new OverRiding();
		s.cook();
	}
}
