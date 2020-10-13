package project2;

public class TransportRunner {

	public static void main(String[] args) {
	  Car c=new Car("TATASUMO");
	  c.wheels();
	  c.owner();
	  System.out.println(c.owner1());
	  System.out.println(c.getName());
	  
	  System.out.println("-----------------------------------------");
	  
	  AirTransport a=new AirTransport("Airforce1");
	  System.out.println(a.getName());
	  a.owner();
	  a.maxFlyHight();
	  
	  System.out.println("-----------------------------------------");
	  
	  Boat b=new Boat("votvoti");
	  System.out.println(b.getName());
	  b.move();
	  b.floats();
	  
	  

	}

}
