package factorydesignpattern;

public class BikeStore {

	public BikeStore() {}
	
	/**
	 * Bikestore creates a variable 'type' that accounts for any case of the three bicycles listed
	 * if one of the cases match then an if-statement is utilized
	 * @param type
	 * @return constructed bike
	 */
	public Bike orderBike(String type)
	{
		Bike bike = null;
		
		if(type.equalsIgnoreCase("Tricycle"))
		{
			bike = new Tricycle();
		}
		else if(type.equalsIgnoreCase("Kids Bike"))
		{
			bike = new KidsBike();
		}
		else if(type.equalsIgnoreCase("Strider"))
		{
			bike = new Strider();
		}
		
		/**
		 * Grabs methods from the Bike class.
		 */
		bike.createFrame();
		bike.addWheels();
		bike.addPedals();
		bike.getPrice();
		
		return bike;
	}
}
