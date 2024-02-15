package assignment4;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner; 
public class assignment4 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		 	int total=0;
			String[] kelimelerim=new String[3];
	          Scanner input=new Scanner(System.in);
		 		File myObj = new File("scores.txt");
	          Scanner myReader = new Scanner(myObj);
	         
	            String data = myReader.nextLine();
	            String[] kelimeler = data.split("[,: ]");
	            	        	          
	          myReader.close();
	          
	          for(int i=0;i<kelimelerim.length;i++) {
	          System.out.println("Guess using these letters "+ kelimeler[0]);
	          kelimelerim[i]=input.nextLine();
	          kelimelerim[i]=kelimelerim[i].toUpperCase();
	          kelimelerim[i]=kelimelerim[i].trim();
	          }
	          for(int j=0;j<kelimelerim.length;j++) {
	        	  boolean deneme=true;
	        	  for(int k=0;k<j;k++) {
	        		  if(kelimelerim[j].equals(kelimelerim[k])) {
	        			  deneme=false;
	        			  System.out.println(kelimelerim[j]+" kelimesini daha önce girmiþsin hesaplanamaz!"); 
	        			 System.out.println(" "); break;
	        		  }
	        	  }
	        	  int sayma=1;
	        	  if(deneme==true) {
	        		  for(int z=0;z<kelimeler.length;z++) {        			 
	        			  if(kelimelerim[j].equals(kelimeler[z])) {
	        				  total+=puanlama(kelimelerim[j]);
	        				  System.out.println("Kelimeniz: "+kelimelerim[j]+" Puanýnýz: "+puanlama(kelimelerim[j]));
	        				  System.out.println(" ");
	        				  break;
	        			  }
	        			 
	        			  if(kelimelerim[j]!=kelimeler[z]) {
	        				 sayma++;
	        			  }
	        		  }
	        		  if(sayma==13) {
	        			  System.out.println(kelimelerim[j]+" anlamlý bir kelime deðil.");
	        		  System.out.println(" "); }
	        	  }	        	  	        	 	        	 	        	  	        	  
	          }
	          System.out.println("Total puanýnýz: " +total);
	}
public static int puanlama(String kelime) {
	kelime=kelime.toLowerCase();	
	char[] alfabe= {'x','a','b','c','ç','d','e','f','g','ð','h','i','ý','j','k','l','m','n','o','ö','p','r','s','þ','t','u','ü','v','y','z'};
		int sum=0;
		
		for(int j=0;j<kelime.length();j++) {
			char b=kelime.charAt(j);
			for(int i=0; i<alfabe.length ;i++) {
				if(alfabe[i]==b) {
					sum+=i;
				}
				}	
		}	
	return kelime.length()*sum;
}	          	          	          	          	          
	}


