package factorydesignpattern;

public class Tricycle extends Bike{ 
	
/**
 * Setting protected variables to corresponding bike conditions
 */
	public Tricycle()
	{
		name = "Tricycle";
		price = 54.95;
		numWheels = 3;
		hasPeddals = true;
		hasTrainingWheels = false;
	}
}
