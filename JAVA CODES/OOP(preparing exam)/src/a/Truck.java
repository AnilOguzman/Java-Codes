package a;

class Truck extends Vehicle {

	
	
	public Truck(String vehicleIdNumber) {        // bunun yerine vehicle a Vehicle(){} 
													// constructorýný ekleyebilirz
		super(vehicleIdNumber);
		// TODO Auto-generated constructor stub
	}
	private int cargoWeightLimit;
public void setWeightLimit(int newLimit) {
cargoWeightLimit = newLimit;
}
public int getWeightLimit() {
return cargoWeightLimit;
}
}

