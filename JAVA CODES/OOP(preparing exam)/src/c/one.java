package c;

public class one  {
	private int number;
	int a=3;
	
	one(){
	System.out.println("constructor boş");
	}
	
	
	one(int a){
	this();
	System.out.println("dolu int a");
	}
	one(int a,int b){
		this(b);
		System.out.println("dolu int a b");
		
	}
	
	
	
	
	
	
	
	
	public void setNumber(int num) {
		this.number=num;
	}
	public int printNumber(){
		return number;
	}
	public void print_geek()
    {
        System.out.println("Geeks");
    }
}
