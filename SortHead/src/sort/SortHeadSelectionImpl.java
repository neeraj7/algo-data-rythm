package sort;

public class SortHeadSelectionImpl implements SortHead {

	@Override
	public void sort(int[] arr) {
		// save the index of minimum element 
		int min, temp;
		
		for(int i=0; i<arr.length; i++) {
			min = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] == arr[min])
					continue;
				else if(arr[j] < arr[min])
					min = j;		
			}
			
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;						
		}		
	}
}
