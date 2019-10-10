package study01.test11;

import java.util.ArrayList;

public class WhileTest 
{
	 public static void main(String[] args)
	 {
		 int i = 1;
		 
		 ArrayList<String> sl = new ArrayList<String>();
//		 while(sl.size() < 5)
//		 {
//			 sl.add("add me");
//			 System.out.println(sl.get(0));
//		 }
		 
		 do 
		 {
			 sl.add("add me to");
		 } 
			 while(sl.size() < 5);
		 
		 
	 }
}
