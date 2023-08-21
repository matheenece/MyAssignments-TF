package week1.day2;

public class LearnContinueStatement {
public static void main(String[] args) {
		
		for (int i=1; i<=10; i++) {
			if (i==3) {
				System.out.println("Three");
				continue;
			}
			System.out.println(i);
		}
		System.out.println("Out of for loop");
}

}

