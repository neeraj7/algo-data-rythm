import org.junit.Assert;
import org.junit.Test;

import sort.SortHead;
import sort.SortHeadInsertionImpl;

public class SortHeadInsertionImplTest {
	
	SortHead sort = new SortHeadInsertionImpl();
	
	@Test
	public void testSort() {
		int arr[] = { 6, 4, 8, 2, 1, 5 };
		sort.sort(arr);
		int expected[] = { 1, 2, 4, 5, 6, 8 };
		Assert.assertArrayEquals(expected, arr);
	}

}
