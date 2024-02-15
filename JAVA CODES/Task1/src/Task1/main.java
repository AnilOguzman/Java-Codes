package Task1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		coffee p1,p2,p3,p4;
		p1=new coffee(0.6,100);
		p2=p1;
		p3=new coffee(0.9,150);
		p4=p3;
		p1.calculate_price();
		p2.calculate_price();
		p3.calculate_price();
		p4.calculate_price();
		p2.calculate_price();
		p4.weight=1.5;
		p3.calculate_price();
		p4.calculate_price();
		p4=new coffee(2,200);
		p4.calculate_price();
		p3.calculate_price();
	}

}
