package zzgereksiz1;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.util.InputMismatchException;
public class a5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		boolean z= true;
		Scanner input = new Scanner(System.in);
		System.out.println("Yaz");
		
		String name=input.next();
		File myfile = new File(name+".txt");
		myfile.createNewFile();
		do {
		try {
		
		FileWriter x = new FileWriter(myfile);
		System.out.println("Biþeyler Yaz");
		int a=input.nextInt();
		x.write(a);
		x.close();
		z=false;
		}
		catch(InputMismatchException ex) {
			input.nextLine();
			
		}
		}
		while(z);
	}
	  }
			
