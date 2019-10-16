package study01.test15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;					//interface

public class MapTest 
{
	public static void main(String[] args)
	{
//		String str = "2019-10-16";
//		str = str.replace("-", ".");
//		System.out.println(str);
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("좋아하는일 ", " 없다");
		map.put("좋아하는음식 ", " 육류");
		map.put("좋아하는것 ", " 컴퓨터");
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext())				//method 앞에 get,set,is(의문문),has(가지고 있는지?) - is,has 의 return 값은 boolean
		{								//hasNext() = 다음것(next)을 가지고 있는가?(has)
			String key = it.next();
			System.out.print(key);
			String value = map.get(key);
			System.out.println(" : " + value);
		}
	}
}