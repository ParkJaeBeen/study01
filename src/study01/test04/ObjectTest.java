package study01.test04;

public class ObjectTest 				//���������� - public protected private - �ƹ��͵� �Ƚ������� default
{										//public - �������� ��밡��   
	int age;							//protected - ������Ű�� ������ ��밡��, ���� ��ӹ޾Ҵٸ� �װ������� ��밡��
	String name;						//default - ���� ��Ű�� ������ ��밡��
										//private - ���� class �������� ��밡��
	String getSrt()
	{
		return null;
	}
	
	public static void main(String[] args)
	{
		ObjectTest ot = new ObjectTest();				//ObjectTest method �ȿ� �������� ��� �ʱ�ȭ
		System.out.println(ot.name);
		System.out.println(ot.age);
	}
}