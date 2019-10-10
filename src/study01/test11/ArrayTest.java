package study01.test11;

public class ArrayTest 
{
	public static void main(String[] args)
	{
		int [][] nums = new int[4][];		//앞 배열[] 의 데이터타입은 int배열[] 뒤 배열[] 은 int 
											//뒤의 배열에는 방개수를 정해주지 않아도 됨
		nums[0] = new int[3];
		nums[1] = new int[10];				
//		System.out.println("0층의 방개수는 : " + nums[0].length + "개");
//		System.out.println("1층의 방개수는 : " + nums[1].length + "개");
	}
}
