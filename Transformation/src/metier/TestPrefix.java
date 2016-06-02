package metier;

import static org.junit.Assert.*;

import org.junit.Test;
/*
 * 
 */
public class TestPrefix {
	Prefix pf = Prefix.getInstance();
	String str1 = "alma";
	String str2 = ".bonjour";
	String str3 = "BonJour";
	String str4 = "PTR";
	@Test
	public void test() {
		assertEquals(pf.transform(str1),"toto"+str1);
		assertEquals(pf.transform(str2),"toto"+str2);
		assertEquals(pf.transform(str3),"toto"+str3);
		assertEquals(pf.transform(str4),"toto"+str4);
	}

}
