package binarysearch;

public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {1, 2, 3, 4, 5, 6};
		
		System.out.println(binarysearch(list,5));
			
		}
			
		public static int binarysearch(int list[],int key) {
			int max=list.length-1;
			int min=0;
			
			while(min<max) {
				int mid=(max+min)/2;
				if(key<list[mid])
					max=mid-1;
				else if(list[mid]==key)
					return mid;
				else
					min=mid+1;
			}	
			return 0;
	}

}
