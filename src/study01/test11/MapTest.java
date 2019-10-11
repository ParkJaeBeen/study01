package study01.test11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapTest 
{
	static void changeMap(HashMap<String,String> map)
	{
		map = new HashMap<String,String>();
		map.put("나이","44");
	}
	
	public static void main(String[] args)
	{
		HashMap<String,String> map = new HashMap<String,String>();		//HashMap<> <<- < (1) , (2) > 안의 값은 (1) = key, (2) = value
		map.put("이름","박재빈");				//이 value 는 key 이다 ex) 이 박재빈 은 이름 이다
		map.put("나이","24");
		map.put("주소","경기도 일산");
		map.put("성별","남자");
//		System.out.println(map);
//		map.put("성별","여자");				//같은 key에 값을 저장할때는 마지막에 저장한 값이 덮어씌워진다
//		System.out.println(map.get("이름"));	//map.get() 시 () 안쪽에 key 를 써주어야 한다
		
//		List<HashMap<String,String>> hml = new ArrayList<HashMap<String,String>>();
//		hml.add(map);
//		hml.add(map);
		
//		System.out.println(hml);
//		System.out.println(hml.get(1));
//		
//		map = new HashMap<String,String>();		//map 메모리 데이터를 새로 생성
//		System.out.println(map);				//map 은 초기화되어 {} 만 출력되지만
//		System.out.println(hml.get(0));			//hml 은 초기화 되지 않아 map 이 가지고 있던 {이름=박재빈, 주소=경기도 일산, 나이=24, 성별=남자} 를 그대로 출력한다
		changeMap(map);
		System.out.println(map);
	}
}
