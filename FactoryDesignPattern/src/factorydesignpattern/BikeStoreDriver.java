package factorydesignpattern;

public class BikeStoreDriver {

	public void runBikeStore() {
		BikeStore bikeStore = new BikeStore();
		
		Bike Tricycle = bikeStore.orderBike("tricycle");
		System.out.println("\n-----------------------------------\n");
		
		Bike Strider = bikeStore.orderBike("strider");
		System.out.println("\n-----------------------------------\n");
		
		Bike KidsBike = bikeStore.orderBike("kids bike");
		System.out.println("\n-----------------------------------\n");
	}
	public static void main(String[] args) {
		BikeStoreDriver driver = new BikeStoreDriver();
		driver.runBikeStore();
	}

}
