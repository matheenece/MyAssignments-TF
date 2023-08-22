package week1.day2;

public class Fibbinocci 
{
	public static void main(String[] args) 
	{
		int a = 0;
		int b = 1;
		int sum = 0;
		
		System.out.println("Fibbinocci series is: ");
		System.out.println(a);
		System.out.println(b);
		
		for (int i = 1; i < 10; i++)
		{
			sum = a+b;
			a = b;
			b = sum;
			
			System.out.println(sum);
		}
		
	}
}
