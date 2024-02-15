package array;
import java.util.*;
public class cevapanahtarı {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=input.nextInt();
		int i=1;
		int j=0;
		System.out.println(fibonacci(num,i,j));
		
	}
	public static int fibonacci(int num, int i , int j ){
	 if(num == 0) {
		 return j;
	 }
	
	 return fibonacci(num - 1, i+j, i);
	}
}