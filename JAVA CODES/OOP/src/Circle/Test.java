package Circle;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle circle1 = new Circle();
		  System.out.println("The area of the circle of radius "     //ilk constructor syesinde kullanabildik 
		  + circle1.radius + " is " + circle1.getArea());			//radiusu private yaparsan circle1.radiusa dalan eri�emiyosun
		  															// getradius ve setradiusa ihtiyac�n oluyor
		  
		 Circle circle2 = new Circle(25);
		 System.out.println("The area of the circle of radius "       //ikinci constructor sayesnde circle(25) yazabildik 
		 + circle2.radius + "is" + circle2.getArea());
		
		 
		 Circle circle3 = new Circle(125);
		 System.out.println("The area of the circle of radius "
		 + circle3.radius + " is " + circle3.getArea());
		
		 
		 circle2.radius = 100;                                                    // or circle2.setRadius(100)                 
		 System.out.println("The area of the circle of radius "					//iki �ekilde radiusu g�ncelleyebilece�imizi ��rendik
		 + circle2.radius + " is " + circle2.getArea());
		 
		 System.out.println(new Circle (25).getArea());                        // b�yle direkt de kullan�labilir obje olu�turmadan
		circle1.numberOfObjects=10;									// b�yle de�i�tirebiliriz bu da hi� verimli bir kodlama de�il bu y�zden private yapmal�yd�k numberofobjectsi
		System.out.println(circle1.getNumberOfObjects());		// static kullan�m�n� ��rendik e�er staticleri kald�r�rsak di�er classtan sonu� 1 ��kard�
																			
		
		
		
	}

}
