package jeff;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

class SampleTest {

	private Sample s;
	
	@BeforeEach
	public void setUp() throws Exception {
		HashMap<String, Integer> data = new HashMap<>();
		data.put("foo", 1);
		s = new Sample(data);
	}
	
	@Test
	void testIsValid() {
		assertEquals(false, s.isValid());
	}

	
	@Test
	void testGetData() {
		assertEquals(1, s.getData("foo"));
	}
}
