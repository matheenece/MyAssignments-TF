package homeAssignment;

//Create a class for TwoWheeler and declare variables with appropriate value
public class TwoWheeler 
{
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 56325626325L;
	boolean isPunctured = false;
	String bikeName = "Royal Enfield";
	double runningKM = 55222.3;
	
	public static void main(String[] args) 
	{
		TwoWheeler Wheeler = new TwoWheeler();
		
		System.out.println("Number of Wheels: " +Wheeler.noOfWheels);
		System.out.println("Number of Mirrors: " +Wheeler.noOfMirrors);
		System.out.println("ChassisNumber is: " +Wheeler.chassisNumber);
		System.out.println(Wheeler.isPunctured);
		System.out.println("My Bike Name is: " +Wheeler.bikeName);
		System.out.println("Total Kilometers: " +Wheeler.runningKM);
	}
}
