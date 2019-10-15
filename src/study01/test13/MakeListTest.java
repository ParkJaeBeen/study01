package study01.test13;

public class MakeListTest 
{
	private String[] strs;
	
	public MakeListTest()
	{
		this.strs = new String[0];
	}
	
	public int size()
	{
		return strs.length;
	}
	
	public void add(String str)
	{
		String[] tmp = this.strs;
		this.strs = new String[strs.length + 1];
		this.strs[strs.length-1] = str;
		
		for(int i = 0; i < tmp.length; i++)
		{
			this.strs[i] = tmp[i];
		}
	}
	
	public String toString()
	{
		String str = "[";
		for(int i = 0; i < strs.length; i++)
		{
			str += strs[i] + ",";
		}
		str = str.substring(0, str.length() - 1);
		str += "]";
		
		return str;
	}
	
	public int indexOf(String str)
	{
		for(int i = 0; i < strs.length;i++)
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
		int idx = indexOf(str);
		String[] ss = strs;
		strs = new String[strs.length - 1];
		
		for(int i = 0; i < idx; i++)
		{
			strs[i] = ss[i];
		}
		
		for(int i = idx + 1; i < ss.length; i++)
		{
			strs[i - 1] = ss[i];
		}
	}
	
	public static void main(String[] args)
	{
		MakeListTest mlt = new MakeListTest();
		mlt.add("a");
		mlt.add("b");
		mlt.add("c");
		mlt.add("d");
		mlt.add("e");
		mlt.add("f");
		System.out.println(mlt.size());
		System.out.println(mlt);
		System.out.println(mlt.indexOf("c") + "번 index 에 있다");
		mlt.remove("e");
		mlt.remove("b");
		System.out.println(mlt);
	}
}
