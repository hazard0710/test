package project2;

public class Ship extends WaterTransport{

	public Ship(String name) {
		super(name);
		
	}
	public void floats() {
		  System.out.println("it floats on water");
	 }
	public void size() {
		System.out.println("the size of the ship can be big or medium");
	}

}
