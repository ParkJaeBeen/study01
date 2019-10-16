package study01.test15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MyKeyTest 
{
	public static void main(String[] args)
	{
		Map<String, String> mmap = new HashMap<String,String>();
		
		mmap.put("key1","value1");
		mmap.put("key2","value2");
		mmap.put("key3","value3");
		
		Iterator<String> it = mmap.keySet().iterator();
		
		while(it.hasNext())
		{
			String key = it.next();
			String value = mmap.get(key);
			System.out.println(key + " : " + value);
		}
	}
	
}
