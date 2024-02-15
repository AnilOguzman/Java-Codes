package zzgereksiz;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] b={"D","B","D","C","C","D","A","E","A","D"};
		String[][] a= {
				{"A","B","A","C","C","D","E","E","A","D"},
				{"D","B","A","B","C","A","E","E","A","D"},
				{"D","B","D","C","C","D","A","E","A","D"},
		};
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[i].length;j++) {
					if(a[i][j]==b[j])
						System.out.print(j+1+". soru=D ");
					else
						System.out.print(j+1+". soru=Y ");
				}
				System.out.println(" ");
			}
		
		
		
		}
		
	}


