package metier;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMajuscule {

	Majuscule maj = Majuscule.getInstance();
	
	@Test
	public void test() {
		String s = "mot_en_minuscule";
		assertEquals("MOT_EN_MINUSCULE", maj.transform(s));
	}

}
