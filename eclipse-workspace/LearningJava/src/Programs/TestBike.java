package Programs;

public class TestBike {

	public static void main(String[] args) 
	{
		Bike b= new Bike();
		b.colour="Black";
		b.startBike();
		
		makeHonda m = new makeHonda();
		m.colour = "Blue";
		m.startBike();
		m.tyreType();
		
		Bike b1 = new makeHonda();
		b1.startBike();
		b1.stopBike();
	}

}
