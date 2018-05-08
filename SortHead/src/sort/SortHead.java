package sort;

public interface SortHead {
	
	public void sort(int[] arr);	
	
	default void toString(int[] arr) {
		for(int i=0; i<arr.length; i++)
			System.out.print(" " + arr[i]);
	}
}
