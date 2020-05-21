package factorydesignpattern;

public abstract class Bike {
	/**
	 * Protected variables allow for undisturbed cross-inheritance.
	 */
	protected String name;
	protected double price;
	protected int numWheels;
	protected boolean hasPeddals;
	protected boolean hasTrainingWheels;
	
	/**
	 * Methods below are enacted upon once the protected variables are gathered from their respective classes
	 */
	public void createFrame()
	{
		System.out.println("Assembling " + name + " frame");
	}
	
	public void addWheels()
	{
		System.out.println("Adding " + numWheels + " wheel(s)");
		if(hasTrainingWheels == true)
		{
			System.out.println("Adding training wheels");
		}
	}
	
	public void addPedals()
	{
		if(hasPeddals == true)
		{
			System.out.println("Adding Pedals");
		}
		else
		{
			System.out.print(" ");
		}
	}
	
	public void getPrice()
	{
		System.out.println("Price: " + price);
	}
}
