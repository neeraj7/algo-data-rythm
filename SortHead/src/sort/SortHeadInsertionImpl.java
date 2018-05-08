package sort;

public class SortHeadInsertionImpl implements SortHead {

	@Override
	public void sort(int[] arr) {
		
		for(int i=1; i<arr.length; i++) {
			for(int j=i-1; j>=0; j--) {
				if(arr[j] > arr[i]) {
					int temp = arr[i];
					for(int k=j; k<i; k++) {
						arr[k+1] = arr[k];
					}
					arr[j] = temp;
				}
			}
		}

	}	

}
