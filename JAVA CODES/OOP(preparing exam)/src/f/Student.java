package f;

public class Student {
	String name,surname;
	long id;
	static int count;
	
	Student(String name)
	{
		this.name=name;
	}
	Student(String name,String surname)
	{
		this(name);
		this.surname=surname;
		
	}
	Student(String name,String surname,long no)
	{
		this(name,surname);
		count++;
		this.id=no;
	}
	Student (Student obj)
	{
		this(obj.name,obj.surname,obj.id);
	}
	public static void toUpper(Student obj)
	{
		obj.name=obj.name.toUpperCase();
		obj.surname=obj.surname.toUpperCase();
	}
	public static void main(String [] args)
	{
		Student s1=new Student("Barýþ","Dinç",19500403001L);
		Student s2=new Student(s1);
		s2.id=12345678900L;
		s2.name="default";
		s2.surname="default";
		toUpper(s2);
		System.out.printf("%s%d", "Number of Students:",Student.count);
		System.out.printf("\n\n%s%22s%18s\n","Name","Surname","Student ID");
		System.out.printf("%s%20s%20d\n",s1.name,s1.surname,s1.id);
		System.out.printf("%s%20s%18d\n",s2.name,s2.surname,s2.id);
	}
}
