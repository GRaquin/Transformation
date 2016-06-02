package metier;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSuffixe {

	@Test
	public void testSuffixe() {
		assertEquals(Suffixe.getInstance().transform("bon", "jour"), "bonjour");
		assertEquals(Suffixe.getInstance().transform("possible", "ment"), "possiblement");
	}

}
