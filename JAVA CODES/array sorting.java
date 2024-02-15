package sorting;

public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list= {3,2,4,7,2,1};
		int temp=0;
		for(int i=0;i<list.length;i++) {
		for(int j=list.length-1;j>i;j--) {
			if(list[i]>list[j]) {
				temp=list[i];
				list[i]=list[j];
				list[j]=temp;
			}
		}
		}
	  for(int i=0;i<list.length;i++)
	  System.out.println(list[i]);
	}

}
