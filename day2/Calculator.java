package week1.day2;

public class Calculator {

	private int addTwoNumbers(int num1,int num2) 
	{
		return num1+num2;
	}
	
	public float mul(float Num1,int Num2) 
	{
		return Num1*Num2;
	}
	
	public void sub() {
		int a=40;
		int b=20;
		System.out.println("Subtraction of two number is " +(a-b));
	}
	
	public static void main(String[] args) {
		Calculator cal1 = new Calculator();
		
		System.out.println("Sum of two numbers is: "+cal1.addTwoNumbers(10,5));
		System.out.println("Multiplication of two numbers is: "+cal1.mul(5.4f, 8));
		cal1.sub();
	}
}
