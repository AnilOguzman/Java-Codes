package sort;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int list[]= {5,1,4,6,2,3};
	
        for (int i = 1; i < list.length; ++i) {
            int key = list[i]; 
            int index = i - 1;     
  
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (index >= 0 && list[index] > key) {
                list[index + 1] = list[index];
                index=index-1;
            }
            list[index+1 ] = key;
        }
        for(int i=0;i<list.length;i++) {
       	 System.out.println(list[i]);
        }
	}
}
