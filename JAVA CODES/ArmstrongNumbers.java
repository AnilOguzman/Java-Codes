
public class ArmstrongNumbers {

	public static void main(String[] args) {
		
		int birler,onlar,yuzler;
		System.out.println("Armstrong numbers between 0 and 500:");
		for(int i=0;i<=500;i++)
		{
			int tmp=i;
			birler=tmp%10;
			tmp=tmp/10;
			onlar=tmp%10;
			tmp/=10;
			yuzler=tmp%10;	
			if(Math.pow(birler, 3)+Math.pow(onlar, 3)+Math.pow(yuzler, 3)==i)
				System.out.print(i+" ");
		}
		
	}
}
