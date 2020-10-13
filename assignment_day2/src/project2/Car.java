package project2;

public class Car extends RoadTransport{

	public Car(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void wheels() {
		System.out.println("it has 4 wheels");
	}
	
	public String owner1() {
		return ("specially rich people own it");
	}
}
