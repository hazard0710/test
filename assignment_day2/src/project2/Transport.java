package project2;

public abstract class Transport {
	 String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Transport(String name) {
		this.name = name;
	}
	
	abstract public void move();
	abstract public void modeTransport();
	abstract public void transportTime();
	abstract public void driverType();
	abstract public void colour();
	abstract public void owner();
}
