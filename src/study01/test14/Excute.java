package study01.test14;

import java.util.ArrayList;
import java.util.List;

public class Excute 
{	
	public static void main(String[] args)
	{
		Person p = new Person();
		List<Person> pl = new ArrayList<Person>();
		p.setAddress("서울");
		p.setAge(23);
		p.setName("홍길동");
		pl.add(p);
		p = new Person();
		p.setAddress("대구");
		p.setAge(34);
		p.setName("홍게");
		pl.add(p);
		p = new Person();
		p.setAddress("일산");
		p.setAge(25);
		p.setName("홍합");
		pl.add(p);
		p.setName("asd");
		
		System.out.println(pl);
		System.out.println(p);
	}
}

