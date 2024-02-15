package YoutubeSoru;
import java.util.Scanner;
public class EmpDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your name,salary,work hours,hire date");
	Scanner input=new Scanner(System.in);
	String name=input.next();
	double salary=input.nextDouble();
	double workhours=input.nextDouble();
	double hireyear=input.nextDouble();
	Employee e1=new Employee(name,salary,workhours,hireyear);
	e1.toString(e1);
	System.out.println(salary-e1.Tax(salary)+e1.Bonus(workhours));
	System.out.println(salary+e1.RaiseSalary(hireyear, salary));
	
	
	
	
	
	
	
	
	
	}

}
