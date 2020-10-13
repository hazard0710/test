package day1;

public class Animal {

	private String eats;
	private int noOfLegs;
	public Animal(String food,int legs) {
		
		this.eats=food;
		this.noOfLegs=legs;
	}
	public String getEats() {
		return eats;
	}
	public void setEats(String eats) {
		this.eats = eats;
	}
	public int getNoOfLegs() {
		return noOfLegs;
	}
	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
	

}
