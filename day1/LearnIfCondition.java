package week1.day1;

public class LearnIfCondition {
	
	public static void main(String[] args) {
		
		//Problem statement
		//Find whether the given number is positive or negative
		//input
		int number = 0;
		//type if -> ctrl+space -> enter
		
		if (number>0) { //if(35>0) -> true
			System.out.println("The given number :" +number +"is Positive");
		}
		else if(number==0) {
			System.out.println("The given number :" +number +"is Neutral");
		}
		else {
			System.out.println("The given number :" +number +"is Negative");
		}
			
	}
}
