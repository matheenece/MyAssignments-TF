package week1.day2;

public class Bicycle {
	
	//accessmodifier returntype methodname inputarguments
	public int getCycleCount() {
		return 2;
	}
	
	public String getCycleColor(String brandName,String color) {
		// TODO Auto-generated method stub
		return brandName + " " +color;
	}
	
	public int addTwoNumber(int Num1,int Num2) {
		return Num1+Num2;
	}
	
	public void getOTP() {
		System.out.println("No!!");
	}
	
	public static void main(String[] args) {
		//Classname objectname = new ClassName();
		Bicycle bc = new Bicycle();
		System.out.println(bc.getCycleCount());
		System.out.println(bc.getCycleColor("Honda", "Red"));
	}
}
