package Bicycle;

public class BicycleRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Bicycle bike1, bike2;
	String owner1, owner2;
		bike1 = new Bicycle( ); //Create and assign values to bike1
		bike1.setOwnerName("Adam Smith");
		bike2 = new Bicycle( ); //Create and assign values to bike2
		bike2.setOwnerName("Ben Jones");
	
		owner1 = bike1.getOwnerName( );
		owner2 = bike2.getOwnerName( );
		System.out.println(owner1 + " owns a bicycle.");
		System.out.println(owner2 + " also owns a bicycle.");
	}

}
