package study01.test10;

import java.util.ArrayList;

public class IntegerList 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();		// '<>' << 작성 안해도 작동함,안할시 object
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		al.add(90);
		
		for(int i = 0; i < al.size();i++)
		{
			System.out.println(i + "번방 : " + al.get(i));		//값을 가져올때 .get()
		}
	}
}
