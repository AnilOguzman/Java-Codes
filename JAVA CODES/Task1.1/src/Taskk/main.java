package Taskk;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1,e2,e3,e4;
		 e1=new Employee(100,"Sarah");
		 e2=e1;
		 e4=new Employee(200,"John");
		 e3=e4;
		 e1.display();
		 e2.display();
		 e3.display();
		 e4.display();
		 e4.emp_no=300;
		 e4.emp_name="David";
		 e3.display();
		 e4.display();
		 e4=new Employee(400,"Diana");     //buraya dikkat
		 e3.display();						// e4 deðiþti ama e3 ayný kaldý
		
	}

}
