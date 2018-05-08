package sort;

public class SortHeadApp {
	
	public static void main(String[] args) {		
		int arr[] = {3,1,4,7,2,4,345,23,64,34,3,2,1};		
		SortHead sorting = new SortHeadSelectionImpl();
		System.out.println("Before sorting : ");
		sorting.toString(arr);
		sorting.sort(arr);
		System.out.println("\nAfter sorting : " );
		sorting.toString(arr);		
	}
	
}
