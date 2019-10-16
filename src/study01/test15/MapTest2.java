package study01.test15;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest2 
{
	public static void main(String[] args)
	{
		Map<String,String> map = new LinkedHashMap<String,String>();
		map.put("햄버거1","빅맥");
		map.put("서브메뉴1","밀크셰이크");
		map.put("햄버거2","와퍼");
		map.put("서브메뉴2","감자튀김");
		map.put("햄버거3","치킨버거");
		map.put("서브메뉴3","살사소스");
		map.put("햄버거4","오징어버거");
		map.put("햄버거5","콰트로치즈와퍼");
		map.put("햄버거6","빅맥");
		
		Iterator<String> i = map.keySet().iterator();
		
		while(i.hasNext())
		{
			String key = i.next();
			String value = map.get(key);
			System.out.println(key + "," + value);
		}
	}
}
