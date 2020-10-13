package day1;

public class testClass {

	public static void main(String[] args) {
	
		Herbivorous horse=new Herbivorous("grass", 4);
		Carnivores lion=new Carnivores("meat",4);
		Animal tiger=new Carnivores("meat",4);
		System.out.println(String.format("horse eats %s" ,horse.getEats()));
		System.out.println("tiger has "+tiger.getNoOfLegs()+ " legs");
		Bird c=new crow("everything",2);
		System.out.println("eats "+c.getEats()+",  no of legs "+c.getNoOfLegs());
		System.out.println(c.legg());
		
	}

}
