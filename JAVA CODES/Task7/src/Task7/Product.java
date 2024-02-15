package Task7;

import Task8.Item;

public class Product extends Item{


	public Product(String name, double price, int amount) {
		super(name, price, amount);
		 // TODO Auto-generated constructor stub
	}

	public double ComputeTaxedPrice()
	{
		return total+total*0.18;
	}
}

