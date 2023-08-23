package homeAssignment;

//Check if the number is positive or negative
public class PosorNeg 
{
	public static void main(String[] args) {
		int number = -45;
		if (number>0) 
		{
			System.out.println("The given number is positive: "+number);
		}
		else if (number<0) 
		{
			System.out.println("The given number is negative: "+number);
		}
		else 
		{
			System.out.println("The given number is either positive or negative: "+number);
		}
	}
}
