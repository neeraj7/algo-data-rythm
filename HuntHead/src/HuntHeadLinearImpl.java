
public class HuntHeadLinearImpl<T> implements HuntHead<T> {

	@Override
	public int searchIndexOf(T[] arr, T element) {		
			for(int i=0; i<arr.length; i++) {
				if(element == arr[i])
					return i;
			}
			return -1;
	}	
}
