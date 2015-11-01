
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestConcatString {
	
	@Test
	public void testConcat() {
		ConcatString myConcat = new ConcatString();
	        String result = myConcat.concat("Hello", "World");
	        assertEquals("HelloWorld", result);
	    }
	

}
