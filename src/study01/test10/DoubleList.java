package study01.test10;

import java.util.ArrayList;

import java.util.Random;

public class DoubleList 
{
	public static void main(String[] args)
	{
		Random r = new Random();
		
		ArrayList<String> sl = new ArrayList<String>();		//순서대로 입력,출력 하는 중에 가장 빠름, method를 사용함
		ArrayList<Double> dl = new ArrayList<Double>();
		
//		dl.add(1.1);
//		dl.add(1.3);
//		dl.add(0.5);
		
		for(int i = 0; i < 10; i++)
		{
			sl.add(r.nextInt(100) + "." + r.nextInt(10));
			dl.add(Double.parseDouble(sl.get(i)));				//세로
		}
//		dl.sort(null);
//		System.out.println(dl);						//가로
//		System.out.println(dl.get(1) + dl.get(2));
		
		for(int i = 0; i < dl.size(); i++)
		{
			for(int j = i+1; j < dl.size(); j++)
			{
				if(dl.get(i) > dl.get(j))
				{
					double tempdb = dl.get(i);
					dl.set(i , dl.get(j));
					dl.set(j, tempdb);
				}
			}
		}
		System.out.println(dl);
	}
}