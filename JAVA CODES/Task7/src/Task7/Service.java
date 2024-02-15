package Task7;

import Task8.Item;

public class Service extends Item {

	public Service(String name, double price, int amount) {
		super(name, price, amount);
		// TODO Auto-generated constructor stub
	}

	public double ComputeTaxedPrice()
	{
		return total+total*0.01;
	}
}
