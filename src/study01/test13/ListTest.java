package study01.test13;

public class ListTest 
{
	private String[] strs;
	
	public ListTest()
	{
		this.strs = new String[0];
	}
	
	public int size() 
	{
		return this.strs.length;
	}
	
	public void add(String str)
	{
		String[] temp = this.strs;
		this.strs = new String[this.strs.length + 1];
		this.strs[strs.length-1] = str;
		for(int i = 0; i < temp.length;i++)
		{
			this.strs[i] = temp[i];
		}
	}
	
	public String toString()			//overRiding 이 적용되어 object 에 있는 toString() 의 데이터타입과 접근제어자가 같아야한다
	{
		String str = "[";
		for(int i = 0; i<strs.length;i++)
		{
			str += strs[i] + ",";
		}
		str = str.substring(0,str.length() - 1);
		str += "]";
		
		return str;
	}
	
	public int indexOf(String str)
	{
		for(int i = 0; i<strs.length; i++)
		{
			if(str == strs[i])
			{
				return i;
			}
		}
		return -1;
	}
	
	public void remove(String str)
	{
		int index = indexOf(str);
		String[] temp = strs;
		strs = new String[strs.length-1];
		
		for(int i = 0;i<index;i++)
		{
			strs[i] = temp[i];
		}
		
		for(int i = index+1; i < temp.length; i++)
		{
			strs[i-1] = temp[i];
		}
	}
	
	public static void main(String[] args)
	{
		ListTest lt = new ListTest();
		lt.add("a");
		lt.add("b");
		lt.add("c");
		lt.add("d");
		lt.add("e");
		lt.add("f");
		
//		System.out.println(lt.size());
//		System.out.println(lt.strs[0]);
		System.out.println(lt.indexOf("9"));
		lt.remove("c");
		System.out.println(lt);
	}
}
