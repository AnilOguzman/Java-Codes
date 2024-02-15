package Task8;


public class Item {
	private int a;
	protected String name;
	protected double price;
	protected int amount;
	protected double total;
	
	protected Item(String name,double price,int amount)
	{
		this.name=name;
		this.amount=amount;
		this.price=price;
		this.total=price*amount;
	}
	
	public double ComputeTaxedPrice()
	{
		return 0;
	}
}
