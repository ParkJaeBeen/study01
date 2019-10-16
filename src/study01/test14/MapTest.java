package study01.test14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapTest 
{
	public static void main(String[] args)
	{
		HashMap<String, String> hm;
		
		List<HashMap<String, String>> hml = new ArrayList<HashMap<String, String>>();

//		System.out.println(hml);						//list 출력시 {} map 출력시 []
		
		for(int i = 1;i < 10;i++)
		{
			hm = new HashMap<String, String>();
			hm.put("이름","이름" + i);
			hm.put("성별","남자");
			hm.put("나이",i + "");
			hml.add(hm);
		}
		
		for(int i = 0; i < hml.size();i++)
		{
			System.out.println(hml.get(i));
		}
		
//		List<List <HashMap <String, String>>> hml2;
		
//		HashMap<String, List<HashMap<String, String>>> totalMap;
 	}
}
