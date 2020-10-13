package project2;

public class RoadTransport extends Transport {

	public RoadTransport(String name) {
		super(name);

	}

	@Override
	public void move() {
		System.out.println("It moves through road");
		
	}

	@Override
	public void modeTransport() {
		System.out.println("It moves through road");
		
	}

	@Override
	public void transportTime() {
		System.out.println("takes comparatively more time");
		
	}

	@Override
	public void driverType() {
		System.out.println("need one driver to drive");
		
	}

	@Override
	public void colour() {
		System.out.println("there's no specific colour,can be anyone");
		
	}

	@Override
	public void owner() {
		System.out.println("owner can be anyone");
		
	}
	
	public void commonlyUsed() {
		System.out.println("most commonly used transport method");
	}

}
