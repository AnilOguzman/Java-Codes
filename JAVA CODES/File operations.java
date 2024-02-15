package zz;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
public class fib {

	 public static void main(String[] args) throws IOException{
	
		 Scanner scan=new Scanner(System.in);
			System.out.print("please enter a file name:");
			String name=scan.nextLine();
			 File myfile=new File(name+".txt");
			 myfile.createNewFile();
			 
				
				if(myfile.createNewFile())
				{
					System.out.println(myfile.getName()+" file created!");
				}
				else
				System.out.println(myfile.getName()+" already exists!");
			
			System.out.print("please enter a string:");	
			String s=scan.nextLine();
			
				FileWriter f=new FileWriter(myfile);
				for(int i=0;i<s.length();i++)
					f.write(s.charAt(i));
				f.close();
				System.out.println("written successfully!");
				f.close();
			
		}

}


