package sort;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int list[]= {5,2,4,6,1,3};
		
		int index;
		for(int i=0;i<list.length-1;i++){
			index=i;
			for(int j=i+1;j<list.length;j++) {
				if(list[j]<list[index]) {
					int temp=list[j];
					list[j]=list[index];
					list[index]=temp;
					}
				}
			}
		for(int a=0;a<list.length;a++)
			System.out.println(list[a]);
	}

}
