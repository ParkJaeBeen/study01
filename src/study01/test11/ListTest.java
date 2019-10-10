package study01.test11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListTest 					//List = interface (new List(); << 불가능)
{
	public static void main(String[] args)
	{
		List<String> sl1 = new ArrayList<String>();				//순서가 있는 리스트, 가장 빨라서 많이 쓰임
																//만약 값이 아주 많다면 앞자리가 사라지면 앞방으로 모든 값을 땡겨옴
		List<String> sl2 = new LinkedList<String>();			//자기 앞 뒤를 알고있는 리스트	 
																//ex) 1은 자기 앞의 아무것도 없는 것과 뒤의 2를 알수있다, 하지만 3은 모른다
																//리스트에 추가,제거,변경 등의 작업을 하고싶을때는 이 리스트를 많이쓴다
//		List<String> sl3 = new Vector<String>();				//느려서 안씀
		sl1.add("1");
		sl1.add("2");
		sl1.add("3");
		sl2.add("1");
		sl2.add("2");
		sl2.add("3");
		System.out.println("sl1 add : "+sl1);
		System.out.println("sl2 add : "+sl2);
		sl1.remove(1);
		sl2.remove(1);
		System.out.println("sl1 remove : "+sl1);
		System.out.println("sl2 remove : "+sl2);
		sl1.get(0);
		sl2.get(0);
		System.out.println("sl1 get : "+sl1);
		System.out.println("sl2 get : "+sl2);
		sl1.set(0, "4");
		sl2.set(0, "4");
		System.out.println("sl1 set : "+sl1);
		System.out.println("sl2 set : "+sl2);
		System.out.println("sl1 size : "+sl1.size());
		System.out.println("sl2 size : "+sl2.size());
	}
}
