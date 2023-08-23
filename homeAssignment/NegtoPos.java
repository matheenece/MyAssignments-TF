package homeAssignment;

//Convert a negative number to a positive number

public class NegtoPos 
{
	public static void main(String[] args) {
		int number = -50;
		if (number<0) 
		{	
			int Posnumber = number*(-1);
			System.out.println("The number is converted to positive "+Posnumber);
		}
		else {
			System.out.println("The given number is positive "+number);
		}
	}
	
}
