package sort;

public class SortHeadBubbleImpl implements SortHead {

	@Override
	public void sort(int[] arr) {
		
		int swap, temp;		
		for(int i=0; i<arr.length-1; i++) {
			swap = 0;
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap++;
				}					
			}
			if(swap == 0)
				break;
		}
	}

}
