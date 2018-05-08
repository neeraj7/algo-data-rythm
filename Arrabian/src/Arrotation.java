/**
 * Aim to rotate the given array of size n by d elements. 
 * 
 * @author neeraj.kumar3
 *
 */
public class Arrotation {
	
	int temp;
	
	public static void main(String[] args) {
		Arrotation arr = new Arrotation();
		int a[] = {55,48,487,48,59,64};
		arr.print(a);
		arr.rotate(a,6,2);
		System.out.println("");		
		arr.print(a);
	}
	
	public void rotate(int arr[], int n, int d) {		
		for(int i=0; i<d; i++) {
			temp = arr[0];
			for(int j=0; j<(n-1); j++) {
				arr[j] = arr[j+1];
			}
			arr[n-1] = temp;
		}
	} 
	
	public void rotateUsingTemp(int arr[], int n, int d) {
		int temp[] = new int[d];
		// Copy d elements in temp array
		for(int i=0; i<d; i++)
			temp[i] = arr[i];
		// Shifting the array by d
		for(int j=0; j<n-d; j++) {
			arr[j] = arr[j+d];
		}
		for(int k=n-d; k<n; k++) {
			
		}
			
		
		
	}
	
	public void print(int arr[]) {
		for(int a : arr)
			System.out.print(a + " ");
	}

}
