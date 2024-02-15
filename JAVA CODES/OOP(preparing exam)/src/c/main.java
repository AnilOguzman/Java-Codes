package c;
import java.util.*;
import java.util.ArrayList;
public class main {

	public static void main(String[] args)
    {
	 enum a {aaa,b,c}
		a apple=a.aaa;
		
	
	ArrayList<Integer> x=new ArrayList<>(10);	
		
	 x.add(new Integer(30));
		
		
		System.out.println(apple);
		Map<String,String> c=new HashMap<String,String>();
		
		
		c.put("a", "a");
		c.put("b", "b");
		c.put("c", "c");
		
		
		for (Map.Entry<String,String> entry : c.entrySet()) {
			System.out.println(entry.getKey() + ":\n" +
			entry.getValue() + "\n");
			}
		
		final int g=5;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		one[] list= new one[10];
	       
	       list[0]=new one();
	       list[0].setNumber(5);

	       for(one a : list) {
	    	  System.out.println(a.printNumber());
	       }
	    
      double[] a= {2,8,9,4,6,7,12,1,6};
      
      badMethod(a);
       
      for(double b : a) {
    	  System.out.println(b);
      }
       
       
    }
	
	public static void badMethod( double[] number ) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many input values? ");
		int N = scanner.nextInt(); 
		number = new double[N];
		for (int i = 0; i < N; i++) {
		System.out.print("Number " + i + ": ");
		number[i] = scanner.nextDouble();
		}
	}
	
}
