package sort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int list[]= {5,1,4,6,2,3};
		
        for (int i = 0; i < list.length - 1; i++) {                            
        	  for (int j = 0; j < list.length - i - 1; j++) {                  
            	if (list[j] > list[j + 1]) {								   
                    // swap arr[j+1] and arr[j]								   
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
                
        }
          
        for(int a=0;a<list.length;a++)
			System.out.println(list[a]);
		
		
		
	}
}
