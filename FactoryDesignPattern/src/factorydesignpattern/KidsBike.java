package factorydesignpattern;

public class KidsBike extends Bike {
	
/**
 * Setting protected variables to corresponding bike conditions
 */
	public KidsBike()
	{
		name = "KidsBike";
		price = 80.99;
		numWheels = 2;
		hasPeddals = true;
		hasTrainingWheels = true;
	}
}
