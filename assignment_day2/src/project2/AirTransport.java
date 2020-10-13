package project2;

public class AirTransport extends Transport {

	public AirTransport(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		System.out.println("It moves through air");
		
	}

	@Override
	public void modeTransport() {
		System.out.println("It moves through air");
	
	}

	@Override
	public void transportTime() {
		System.out.println("It takes vey less time to travel");
		
	}

	@Override
	public void driverType() {
		System.out.println("needs more than one driver to drive");
		
	}

	@Override
	public void colour() {
		System.out.println("mainly white");
		
	}

	@Override
	public void owner() {
		System.out.println("owned by many govt. and private firm");
		
	}
	
	public void maxFlyHight() {
		System.out.println("It can fly very high over the sky");
		
	}
	

}
