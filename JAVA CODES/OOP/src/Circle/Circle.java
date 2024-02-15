package Circle;

class Circle {
	 double radius = 1;
	static int numberOfObjects=0; 
	/** Construct a circle object */
	 Circle() {
		 numberOfObjects++;
	 }
	 /** Construct a circle object */
	 Circle(double newRadius) {
	 radius = newRadius;
	 numberOfObjects++;
	 }
	 /** Return the area of this circle */
	 double getArea() {
	 return radius * radius * Math.PI;
	 }
	 /** Return the perimeter of this circle */
	 double getPerimeter() {
	 return 2 * radius * Math.PI;
	 }
	 /** Set a new radius for this circle */
	 void setRadius(double newRadius) {
	 radius = newRadius;
	 }
	 static int getNumberOfObjects() {
		  return numberOfObjects;
		  }



}

