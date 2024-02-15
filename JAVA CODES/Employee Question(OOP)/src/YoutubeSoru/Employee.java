package YoutubeSoru;

public class Employee {
	String name;
	double salary;
	double workhours;
	double hireyear;
	Employee(){
	
}
	Employee(String name,double salary,double workhours,double hireyear){
		this.name=name;
		this.salary=salary;
		this.workhours=workhours;
		this.hireyear=hireyear;
	}
	public static double Tax(double salary) {
		if(salary<1000) {
			return 0;
		}
		else
			return salary*3/100;
	}
	public static double Bonus(double workhours) {
		return (workhours-40)*30;
	}
	public static double RaiseSalary(double hireyear,double salary) {
		if((2015-hireyear)<10) {
		return salary*5/100;
		}
		else if((2015-hireyear)<20 && (2015-hireyear)>9) {
		return salary*10/100;
		}
		else {
		return salary*15/100;
		}			
	}
	public void toString(Employee obj) {
		System.out.println("Name: " + obj.name);
		System.out.println("Salary: " + obj.salary);
		System.out.println("Work Hours: " + obj.workhours );
		System.out.println("Hire Date: " + obj.hireyear);
		System.out.println("Tax: " + obj.Tax(salary));
		System.out.println("Bonus: " + obj.Bonus(workhours));
		System.out.println("Raise of Salary: " + obj.RaiseSalary(hireyear, salary));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
