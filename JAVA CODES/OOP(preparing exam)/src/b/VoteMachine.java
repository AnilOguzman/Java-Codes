package b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VoteMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		ArrayList<Person> list=new ArrayList<Person>();
		Map<String,Integer> map=new HashMap<String,Integer>();
		for(int i=0;i<3;i++)
		{
			System.out.printf("%d. adayin adini giriniz:",i+1);
			String name=scan.nextLine();
			System.out.printf("%d. adayin mesajini giriniz:",i+1);
			String message=scan.nextLine();
			list.add(new Person(name,message));
			map.put(name,0);
		}
		String x=" ";
		while(true)
		{
			System.out.println("oyunuzu vereceginiz adayin ismini giriniz:");
			x=scan.nextLine();
			if(map.containsKey(x))
				map.put(x, map.get(x)+1);
			else if(x.equals("-1"))
				break;
			else
				System.out.println("gecerli bir aday giriniz!");
		}
		for(Person a:list)
			System.out.println(a.name_surname+":"+map.get(a.name_surname));
	}

}
