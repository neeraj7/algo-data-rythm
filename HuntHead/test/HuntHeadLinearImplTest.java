import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class HuntHeadLinearImplTest {

	@Test
	public void testSearch() {
		HuntHead<String> sh = new HuntHeadLinearImpl<String>();
		String[] str = {"Hi!", "Hello!", "Namastey!", "Hola!"};
		Assert.assertEquals(3, sh.searchIndexOf(str, "Hola!"));	
		Assert.assertEquals(-1, sh.searchIndexOf(str, "Superb!"));
	}
}
