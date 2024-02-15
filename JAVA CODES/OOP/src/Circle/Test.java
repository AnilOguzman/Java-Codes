package Circle;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle circle1 = new Circle();
		  System.out.println("The area of the circle of radius "     //ilk constructor syesinde kullanabildik 
		  + circle1.radius + " is " + circle1.getArea());			//radiusu private yaparsan circle1.radiusa dalan eriþemiyosun
		  															// getradius ve setradiusa ihtiyacýn oluyor
		  
		 Circle circle2 = new Circle(25);
		 System.out.println("The area of the circle of radius "       //ikinci constructor sayesnde circle(25) yazabildik 
		 + circle2.radius + "is" + circle2.getArea());
		
		 
		 Circle circle3 = new Circle(125);
		 System.out.println("The area of the circle of radius "
		 + circle3.radius + " is " + circle3.getArea());
		
		 
		 circle2.radius = 100;                                                    // or circle2.setRadius(100)                 
		 System.out.println("The area of the circle of radius "					//iki þekilde radiusu güncelleyebileceðimizi öðrendik
		 + circle2.radius + " is " + circle2.getArea());
		 
		 System.out.println(new Circle (25).getArea());                        // böyle direkt de kullanýlabilir obje oluþturmadan
		circle1.numberOfObjects=10;									// böyle deðiþtirebiliriz bu da hiç verimli bir kodlama deðil bu yüzden private yapmalýydýk numberofobjectsi
		System.out.println(circle1.getNumberOfObjects());		// static kullanýmýný öðrendik eðer staticleri kaldýrýrsak diðer classtan sonuç 1 çýkardý
																			
		
		
		
	}

}
