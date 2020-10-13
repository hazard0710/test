package day1;

public class Bird extends Animal {

	public Bird(String food, int legs) {
		super(food, legs);
		// TODO Auto-generated constructor stub
	}

	public void fly() {
		System.out.println("it can fly over the sky");
	}
	public int legg() {	
		return getNoOfLegs();	
	}

}
